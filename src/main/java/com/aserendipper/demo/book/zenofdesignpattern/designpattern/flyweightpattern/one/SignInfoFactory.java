package com.aserendipper.demo.book.zenofdesignpattern.designpattern.flyweightpattern.one;

public class SignInfoFactory {
    //报名信息的对象工厂
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
