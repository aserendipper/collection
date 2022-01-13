package com.aserendipper.demo.book.zenofdesignpattern.designpattern.strategypattern.five;

public class Context {
    private Calculator cal = null;

    public Context(Calculator cal) {
        this.cal = cal;
    }
    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
