package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.four;

public interface IVisitor {
    //首先，定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);
    //其次，定义我还可以访问部门经理
    public void visit(Manager manager);
    //统计所有员工工资总和
    public int getTotalSalary();
}
