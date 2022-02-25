package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.five;

public class Agent implements IStar {
    //定义是谁的经纪人
    private IStar star;
    //构造函数传递明星
    public Agent(IStar star) {
        this.star = star;
    }
    //经纪人是不会签字的，签字了歌迷也不认
    @Override
    public void sign() {
        star.sign();
    }
}
