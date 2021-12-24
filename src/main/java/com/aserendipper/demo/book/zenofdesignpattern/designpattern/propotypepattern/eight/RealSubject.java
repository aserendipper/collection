package com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.eight;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->"+ str);
    }
}
