package com.aserendipper.demo.util;

public class StringUtil {
    /**
     * 首字母大写
     *
     * @param name 字符串名称
     */
    public static String captureName(String name) {
        if (name.length() < 1) {
            return null;
        }
        char[] ch = name.toCharArray();
        ch[0] -= 32;
        return String.valueOf(ch);
    }

    /**
     * 首字母小写
     *
     * @param name 字符串名称
     */
    public static String lowerName(String name) {
        if (name.length() < 1) {
            return null;
        }
        char[] ch = name.toCharArray();
        ch[0] += 32;
        return String.valueOf(ch);
    }
}
