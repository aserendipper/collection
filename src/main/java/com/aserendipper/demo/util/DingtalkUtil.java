package com.aserendipper.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 钉钉飞书报警工具类
 */
@Slf4j
@Component
public class DingtalkUtil {
    @Autowired
    ApplicationContext applicationContext;

    private static String activeProfile;

    @Autowired
    private static RedisTemplate<String, Object> RedisTemplate;


    private static String env = "-";
    /**
     * 加签
     */
    private static String DINGTALK_SECRET = "SEC1d618eab6dbb2743070556eb8e411f98a17e5bdcd99681c6";

    /**
     * access_token
     */
    private static String DINGTALK_ACCESSTOKEN = "33bac1c3f0dea3adba85a7e64dbeb1ee0ec33fd075c540e2";

    /**
     * 优先使用 飞书 发送
     */
    private static boolean FEISHU_FIRST = true;
    private static String FEISHU_ACCESSTOKEN = "02660af6-5f8b-4030-bfe2";
    private static String FEISHU_SECRET = "DACcfNfW6jxLw";

    private static boolean DINGTALK_ENABLED = true;
    public static boolean ENABLED_REQUEST_LOG = true;
    public static boolean ENABLED_REQUEST_LOG_RETURNVALUE = false;
    /**
     * 随机数最大值，用于故障时，减少发送push发送量
     */
    private static int RANDOMPUSH_MAXVALUE = 6;

    @PostConstruct
    public void init() {
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        DingtalkUtil.activeProfile = ArrayUtils.isNotEmpty(activeProfiles) ? activeProfiles[0] : null;
        log.info("active profile {}", activeProfile);
    }
    static {
        final ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleWithFixedDelay(() -> {
            BoundValueOperations a0 = RedisTemplate.boundValueOps("DingtalkUtil:DINGTALK_ACCESSTOKEN");
            String v0 = (String) a0.get();
            if (StringUtils.isNotBlank(v0)) {
                DINGTALK_ACCESSTOKEN = v0;
            } else {
                a0.set(DINGTALK_ACCESSTOKEN);
            }
            BoundValueOperations a00 = RedisTemplate.boundValueOps("DingtalkUtil:DINGTALK_SECRET");
            String v00 = (String) a00.get();
            if (StringUtils.isNotBlank(v00)) {
                DINGTALK_SECRET = v00;
            } else {
                a00.set(DINGTALK_SECRET);
            }
            BoundValueOperations a000 = RedisTemplate.boundValueOps("DingtalkUtil:env");
            String v000 = (String) a000.get();
            if (StringUtils.isNotBlank(v000)) {
                env = v000;
            } else {
                a000.set(activeProfile);
            }

            BoundValueOperations a1 = RedisTemplate.boundValueOps("DingtalkUtil:DINGTALK_ENABLED");
            Boolean v1 = (Boolean) a1.get();
            if (v1 != null) {
                DINGTALK_ENABLED = v1;
            } else {
                a1.set(DINGTALK_ENABLED);
            }

            BoundValueOperations a2 = RedisTemplate.boundValueOps("DingtalkUtil:RANDOMPUSH_MAXVALUE");
            Integer v2 = (Integer) a2.get();
            if (v2 != null && v2 > 1) {
                RANDOMPUSH_MAXVALUE = v2;
            } else {
                a2.set(RANDOMPUSH_MAXVALUE);
            }

            BoundValueOperations a3 = RedisTemplate.boundValueOps("DingtalkUtil:ENABLED_REQUEST_LOG");
            Boolean v3 = (Boolean) a3.get();
            if (v3 != null) {
                ENABLED_REQUEST_LOG = v3;
            } else {
                a3.set(ENABLED_REQUEST_LOG);
            }

            BoundValueOperations a4 = RedisTemplate.boundValueOps("DingtalkUtil:ENABLED_REQUEST_LOG_RETURNVALUE");
            Boolean v4 = (Boolean) a4.get();
            if (v4 != null) {
                ENABLED_REQUEST_LOG_RETURNVALUE = v4;
            } else {
                a4.set(ENABLED_REQUEST_LOG_RETURNVALUE);
            }

            BoundValueOperations a5 = RedisTemplate.boundValueOps("DingtalkUtil:FEISHU_FIRST");
            Boolean v5 = (Boolean) a5.get();
            if (v5 != null) {
                FEISHU_FIRST = v5;
            } else {
                a5.set(FEISHU_FIRST);
            }

            BoundValueOperations a6 = RedisTemplate.boundValueOps("DingtalkUtil:FEISHU_SECRET");
            String v6 = (String) a6.get();
            if (StringUtils.isNotBlank(v6)) {
                FEISHU_SECRET = v6;
            } else {
                a6.set(FEISHU_SECRET);
            }
            BoundValueOperations a7 = RedisTemplate.boundValueOps("DingtalkUtil:FEISHU_ACCESSTOKEN");
            String v7 = (String) a7.get();
            if (StringUtils.isNotBlank(v7)) {
                FEISHU_ACCESSTOKEN = v7;
            } else {
                a7.set(FEISHU_ACCESSTOKEN);
            }

        }, 1, 3, TimeUnit.MINUTES);
    }

    private static String getDingtalkUrl(){
        if(FEISHU_FIRST){
            return String.format("https://open.feishu.cn/open-apis/bot/v2/hook/%s", FEISHU_ACCESSTOKEN);
        } else {
            Long timestamp = System.currentTimeMillis();
            String stringToSign = timestamp + "\n" + DINGTALK_SECRET;
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(DINGTALK_SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
                byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
                return String.format("https://oapi.dingtalk.com/robot/send?access_token=%s&timestamp=%d&sign=%s", DINGTALK_ACCESSTOKEN, timestamp, URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8"));
            } catch (NoSuchAlgorithmException | InvalidKeyException | UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static boolean send(String message, String title){
        if (StringUtils.isBlank(message)) {
            return false;
        }
        String key = "DingtalkUtil:PushList";
        Calendar cl = Calendar.getInstance();
        final String msg = message;
        //redis 一分钟队列，Score 时间值，实现过期
        RedisTemplate.execute(new SessionCallback<Object>() {
            @Override
            public <K, V> Object execute(RedisOperations<K, V> operations) throws DataAccessException {
                Date d = new Date();
                cl.setTime(d);
                long now = cl.getTime().getTime();
                cl.add(Calendar.MINUTE,-1);
                long m1 = cl.getTime().getTime();
                operations.multi();

                long t = System.currentTimeMillis();
                operations.opsForZSet().removeRangeByScore((K) key, 0, m1);
                operations.opsForZSet().add((K) key, (V) (d + "(" + t + ") - " + msg), now);
                operations.expire((K) key, 1, TimeUnit.MINUTES);
                operations.exec();
                return null;
            }
        });

        Long size = RedisTemplate.opsForZSet().size(key);
        if (size > 2 * 60) {
            //如果 报警1分钟队列超过“平均每秒2次报警”总数量时，则认定为系统出现严重故障，不再频繁调用钉群接口。
            int m = java.util.concurrent.ThreadLocalRandom.current().nextInt(RANDOMPUSH_MAXVALUE);
            if (m == 3) {
                //只有随机数 等于 3 时，发出报警。
                sendD("报警1分钟队列超过“平均每秒2次报警”总数量。获取近1分钟内报警列表redis命令：ZRANGE "+key+" 0 -1 WITHSCORES", "系统出现严重故障");
            }
            return false;
        } else {
            //钉钉机器人 消息发送频率限制：每个机器人每分钟最多发送20条。
            if (size > 18) {
                int m = java.util.concurrent.ThreadLocalRandom.current().nextInt(RANDOMPUSH_MAXVALUE);
                if (m == 3) {
                    //只有随机数 等于 3 时，发出报警。
                    sendD("1分钟内报警量:" +size + "，“每个机器人每分钟最多发送20条”。获取近1分钟内报警列表redis命令：ZRANGE "+key+" 0 -1 WITHSCORES", "危险:报警量大");
                }
                return false;
            }
        }
        sendD(message,title);
        return true;
    }

    public static void sendD(String msg, String title){
        if ((!DINGTALK_ENABLED) || StringUtils.isBlank(msg)) {
            return;
        }

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        // 设置超时
        requestFactory.setConnectTimeout(2000);
        requestFactory.setReadTimeout(2000);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String codeLine = getLastKRStackTraceLineNumber();
        if (StringUtils.isNotBlank(codeLine)) {
            msg += "\n--调用位置:" + codeLine;
        }
        Map<String, String> hostConfig = getHostConfig();
        if (hostConfig != null && hostConfig.size() > 0) {
            msg += "\n--服务器:" + hostConfig;
        }
        HttpServletRequest request = request();
        msg = FeiShuTalkUtil.getString(msg, request);
        final String msgr = msg;
        try {
            if(FEISHU_FIRST) {
                /*
                ！！！注意：飞书的签名校验与其他的群机器人（钉钉、企业微信等）签名校验不同！！！
                使用 HmacSHA256 算法计算签名，再进行 Base64 编码，得到最终的签名
                    待签名的字符串（msg）：""（空串）
                    签名所需的密钥（key）：timestamp + “\n” + secret
                */
                Long timestamp = System.currentTimeMillis()/1000;
                String key = timestamp + "\n" + FEISHU_SECRET;
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
                byte[] signData = mac.doFinal("".getBytes(StandardCharsets.UTF_8));
                ResponseEntity<String> stringResponseEntity = new RestTemplate(requestFactory).postForEntity(getDingtalkUrl()
                        , new HttpEntity(new HashMap() {
                            {
                                put("timestamp", timestamp);
                                put("sign", new String(Base64.encodeBase64(signData)));
                                put("msg_type", "text");
                                put("content", new HashMap() {
                                    {
                                        put("text", env + "【接口监控 " + title + "】" + msgr);
                                    }
                                });
                            }
                        }, headers), String.class);
                log.info(stringResponseEntity.toString());
            } else {
                new RestTemplate(requestFactory).postForEntity(getDingtalkUrl()
                        , new HttpEntity(new HashMap() {
                            {
                                put("msgtype", "text");
                                put("text", new HashMap() {
                                    {
                                        put("content", env + "【接口监控 " + title + "】" + msgr);
                                    }
                                });
                            }
                        }, headers), String.class);
            }
        }catch (Exception ex){
            log.error("钉群报警访问机器人接口出现异常，请技术介入", ex);
        }

    }

    public static String getLastKRStackTraceLineNumber() {
        try {
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            String className = "";
            for (StackTraceElement se : stack) {
                className = se.getClassName();
                if (!className.startsWith("com.jingdata.paas.metadata.insight.utils.DingtalkUtil")
                        && !className.startsWith("com.jingdata.paas.metadata.insight.config.ContextAspect")
                        && className.startsWith("com.jingdata.")) {
                    className += "." + se.getMethodName() + "(行:" + se.getLineNumber() + ")";
                    return className;
                }
            }
        } catch (Exception ignored) {
        }
        return "";
    }
    private static final Map<String,String> hostConfig = new HashMap<>();

    public static  Map<String,String> getHostConfig(){
        if(hostConfig.size() > 0){
            return hostConfig;
        }
        try{
            InetAddress addr = InetAddress.getLocalHost();
            hostConfig.put("ip",addr.getHostAddress());
            hostConfig.put("hostName",addr.getHostName());
            Properties props=System.getProperties();
            hostConfig.put("os",props.getProperty("os.name"));
            //hostConfig.put("version",props.getProperty("os.version"));
        }catch(Exception ignored){

        }
        return hostConfig;
    }
    public static HttpServletRequest request() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }
}
