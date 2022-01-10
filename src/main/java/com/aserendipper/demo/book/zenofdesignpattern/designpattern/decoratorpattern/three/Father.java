package com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.one.FouthGradeSchoolReport;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.one.SchoolReport;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
