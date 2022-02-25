package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.eight;

public class FilmStar extends AbsStar {
    //默认的电影明星的主要工作是拍电影
    public FilmStar() {
        super(new ActFilm());
    }
    //也可以重新设置一个新职业
    public FilmStar(AbsAction action) {
        super(action);
    }
    //细化电影明星的职责
    @Override
    public void doJob() {
        System.out.println("\n===影星的工作===");
        super.doJob();
    }
}
