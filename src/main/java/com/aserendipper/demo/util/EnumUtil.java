package com.aserendipper.demo.util;

import com.aserendipper.demo.enums.BaseEnum;
import com.aserendipper.demo.model.BasicsEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumUtil {
    private static final String PACKAGE_PATH = "com.kr.rong.enums.";

    /**
     * 反射获取枚举接口
     *
     * @param enumClassPath 枚举名称
     */
    private static BaseEnum[] getEnumValues(String enumClassPath) {
        try {
            Class<?> c = Class.forName(PACKAGE_PATH + enumClassPath);
            return (BaseEnum[]) c.getEnumConstants();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取枚举值集合Map
     *
     * @param enumClassPath 枚举名称
     */
    public static Map<Integer, String> findEnumMap(String enumClassPath) {
        Map<Integer, String> map = new HashMap<>();
        BaseEnum[] baseEnums = getEnumValues(enumClassPath);
        if (baseEnums != null && baseEnums.length > 0) {
            for (BaseEnum baseEnum : baseEnums) {
                map.put(baseEnum.getValue(), baseEnum.getDesc());
            }
        }
        return map;
    }

    /**
     * 获取枚举值集合List
     *
     * @param enumClassPath 枚举名称
     */
    public static List<BasicsEnum> findEnumList(String enumClassPath) {
        List<BasicsEnum> basicsEnumList = new ArrayList<>();
        BaseEnum[] baseEnums = getEnumValues(enumClassPath);
        if (baseEnums != null && baseEnums.length > 0) {
            for (BaseEnum baseEnum : baseEnums) {
                BasicsEnum basicsEnum = new BasicsEnum();
                basicsEnum.setValue(baseEnum.getValue());
                basicsEnum.setDesc(baseEnum.getDesc());
                basicsEnumList.add(basicsEnum);
            }
        }
        return basicsEnumList;
    }
}
