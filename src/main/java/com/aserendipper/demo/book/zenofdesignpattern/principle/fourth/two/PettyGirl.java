package com.aserendipper.demo.book.zenofdesignpattern.principle.fourth.two;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;
    //美女都有名字
    public PettyGirl(String _name) {
        this.name = _name;
    }
    //脸蛋漂亮
    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮！");
    }
    //身材要好
    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒！");
    }
    //气质要好
    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好！");
    }
}
