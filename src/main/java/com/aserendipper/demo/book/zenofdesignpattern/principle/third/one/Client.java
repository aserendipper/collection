package com.aserendipper.demo.book.zenofdesignpattern.principle.third.one;

public class Client {
    public static void main(String[] args) {
        Driver zhangsan = new Driver();
        Benz benz = new Benz();
        //张三开奔驰
        zhangsan.drive(benz);
    }
}
