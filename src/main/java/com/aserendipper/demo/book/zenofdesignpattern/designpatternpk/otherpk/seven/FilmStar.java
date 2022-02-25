package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.seven;

public class FilmStar implements IStar {
    @Override
    public void act(String context) {
        System.out.println("明星演戏：" + context);
    }
}
