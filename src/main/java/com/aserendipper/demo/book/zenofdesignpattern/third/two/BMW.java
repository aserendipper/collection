package com.aserendipper.demo.book.zenofdesignpattern.third.two;

public class BMW implements ICar {
    //宝马车当然也可以开动了
    @Override
    public void run() {
        System.out.println("宝马汽车开始运行...");
    }
}
