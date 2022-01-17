package com.aserendipper.demo.book.zenofdesignpattern.designpattern.adapterpattern.two;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
