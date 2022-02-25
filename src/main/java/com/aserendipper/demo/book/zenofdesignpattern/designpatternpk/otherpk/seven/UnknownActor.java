package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.seven;

public class UnknownActor implements IActor {
    //普通演员演戏
    @Override
    public void playact(String context) {
        System.out.println("普通演员：" +  context);
    }
}
