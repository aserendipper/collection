package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.IVisitor;

public interface ITotalVisitor extends IVisitor {
    //统计所有员工工资总和
    public void totalSalary();
}
