package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.Employee;

import static com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.two.Client.mockEmployee;

public class Client {
    public static void main(String[] args) {
        //展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
        //汇总报表访问者
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : mockEmployee()) {
            //接受展示报表访问者
            emp.accept(showVisitor);
            //接受汇总表访问者
            emp.accept(totalVisitor);
        }
        //展示报表
        showVisitor.report();
        //汇总报表
        totalVisitor.totalSalary();
    }
}
