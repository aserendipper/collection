package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.IVisitor;

public interface IShowVisitor extends IVisitor {
    //展示报表
    public void report();
}
