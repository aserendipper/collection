package com.aserendipper.demo.book.zenofdesignpattern.designpattern.adapterpattern.two;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need and help, pls call me!");
    }
}
