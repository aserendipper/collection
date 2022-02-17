package com.aserendipper.demo.book.zenofdesignpattern.designpattern.flyweightpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.flyweightpattern.one.SignInfo;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
        System.out.println("测试");
        signInfo.setId("1");
        signInfo.setPostAddress("11");
        SignInfo second = SignInfoFactory.getSignInfo("科目1考试地点1");
        System.out.println(second);
    }
}
