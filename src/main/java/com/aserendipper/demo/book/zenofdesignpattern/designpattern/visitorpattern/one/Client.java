package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.one;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.report();
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        //产生张三这个员工
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("编写JAVA程序，绝对的蓝领、苦工加搬运工");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        empList.add(zhangsan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
