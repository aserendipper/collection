package com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.one.SchoolReport;

public class Father {
    public static void main(String[] args) {
        //把美化过的成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        //看成绩单
        sr.report();
        sr.sign("老三");
    }
}
