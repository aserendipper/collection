package com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.one.SchoolReport;

public class SortDecorator extends Decorator {
    //构造函数
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    //告诉排名情况
    private void reportSort() {
        System.out.println("我是排名第38名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
