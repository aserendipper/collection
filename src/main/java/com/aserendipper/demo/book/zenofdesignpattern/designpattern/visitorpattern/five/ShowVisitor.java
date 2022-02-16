package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.CommonEmployee;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.Employee;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.Manager;

public class ShowVisitor implements IShowVisitor {
    private String info = "";
    //打印出报表
    @Override
    public void report() {
        System.out.println(info);
    }
    //访问普通员工，组装信息
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee) + "工作：" + commonEmployee.getJob() + "\t\n";
    }
    //访问经理，组装信息
    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "工作：" + manager.getPerformance() + "\t\n";
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女":"男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
}
