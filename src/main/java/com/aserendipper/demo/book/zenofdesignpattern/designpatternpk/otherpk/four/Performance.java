package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.four;

import java.util.Random;

public class Performance {
    //基本工资
    private BasicSalary salary = new BasicSalary();
    //绩效奖励
    public int getPerformanceValue() {
        int perf = (new Random()).nextInt(100);
        return salary.getBasicSalary() * perf / 100;
    }
}
