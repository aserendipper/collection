package com.aserendipper.demo.book.zenofdesignpattern.designpattern.decoratorpattern.one;

public class Father {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //签名？休想！
    }
}
