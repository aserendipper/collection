package com.aserendipper.demo.book.zenofdesignpattern.third.two;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        IDriver zhangsan = new Driver();
        //张三开奔驰
        ICar benz = new Benz();
        zhangsan.driver(benz);
        //张三开宝马
        ICar bmw = new BMW();
        zhangsan.driver(bmw);

        Map<String, Object> map = new HashMap<>();
    }
}
