package com.aserendipper.demo.book.zenofdesignpattern.designpattern.strategypattern.three;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        //生成一个运算器
        Calculator cal = new Calculator();
        System.out.println("运行结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }
}
