package com.aserendipper.demo.book.zenofdesignpattern.designpattern.proxypattern.eight;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->"+ str);
    }
}
