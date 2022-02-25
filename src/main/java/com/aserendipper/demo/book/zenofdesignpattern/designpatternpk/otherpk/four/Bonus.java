package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.four;

public class Bonus {
    //考勤情况
    private Attendance atte = new Attendance();
    //奖金
    public int getBonus() {
        int workDays = atte.getWorkDays();
        int bonus = workDays * 1800 / 30;
        return bonus;
    }
}
