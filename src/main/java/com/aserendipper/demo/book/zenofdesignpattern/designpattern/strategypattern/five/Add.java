package com.aserendipper.demo.book.zenofdesignpattern.designpattern.strategypattern.five;

public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
