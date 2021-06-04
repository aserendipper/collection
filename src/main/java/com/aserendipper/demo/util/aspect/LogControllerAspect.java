package com.aserendipper.demo.util.aspect;

import com.alibaba.fastjson.JSON;
import com.aserendipper.demo.util.DingtalkUtil;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Controller日志切面类
 */
@Aspect
@Component
public class LogControllerAspect {

    private static final String SERVICE_NAME = "paas-metadata";
    private static final Logger request_log = LoggerFactory.getLogger("request_log");

    @Pointcut(value = "execution(* com.aserendipper.demo.controller..*Controller.*(..))")
    public void pointcut() {}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        if (!DingtalkUtil.ENABLED_REQUEST_LOG){
            return joinPoint.proceed(joinPoint.getArgs());
        }

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String actionStr = "";
        Object[] args = joinPoint.getArgs();
        if(StringUtils.isEmpty(actionStr)){
            return joinPoint.proceed(args);
        }
        Map<String, Object> pMap = new HashMap<String, Object>(16);
        pMap.put("time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
        pMap.put("serviceName", SERVICE_NAME);
        pMap.put("controller", methodSignature.getDeclaringTypeName());
        pMap.put("actionStr", actionStr);
        pMap.put("method", request.getMethod());
        pMap.put("requestURI", request.getRequestURI());
        pMap.put("ua", request.getHeader("user-agent"));
        Enumeration<String> coo = request.getHeaders("cookie");
        if(coo != null && coo.hasMoreElements()) {
            pMap.put("cookie", coo);
        }
        Map<String, String> hmap = new HashMap<String, String>();
        Enumeration<?> enum1 = request.getHeaderNames();
        while (enum1.hasMoreElements()) {
            String key = (String) enum1.nextElement();
            String value = request.getHeader(key);
            if (!StringUtils.equalsIgnoreCase(key, "cookie")) {
                hmap.put(key, value);
            }
            if (StringUtils.equalsIgnoreCase(key, "userId")) {
                pMap.put("userId", value);
            }
        }
        pMap.put("headers", hmap);
        long beginTime = System.currentTimeMillis();
        try {
            Object proceed = joinPoint.proceed();
            pMap.put("proceedTime", System.currentTimeMillis() - beginTime);
            request_log.info(JSON.toJSONString(pMap));
            return proceed;
        } catch (Exception ex){
            pMap.put("proceedTime", System.currentTimeMillis() - beginTime);
            pMap.put("returnValue", "err");
            pMap.put("exception", ex.toString());
            request_log.error(JSON.toJSONString(pMap));
            throw ex;
        }
    }
}
