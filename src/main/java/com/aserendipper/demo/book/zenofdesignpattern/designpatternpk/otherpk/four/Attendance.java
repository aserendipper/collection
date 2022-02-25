package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.four;

import java.util.Random;

public class Attendance {
    //得到出勤天数
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
