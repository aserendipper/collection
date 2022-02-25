package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.eight;

public class Singer extends AbsStar {
    //歌星的默认活动是唱歌
    public Singer() {
        super(new Sing());
    }
    //也可以重新设置一个新职业
    public Singer(AbsAction action) {
        super(action);
    }
    //细化歌星的职责
    @Override
    public void doJob() {
        System.out.println("\n===歌星的工作===");
        super.doJob();
    }
}
