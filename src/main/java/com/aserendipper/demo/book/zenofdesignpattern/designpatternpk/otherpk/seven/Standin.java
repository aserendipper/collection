package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.seven;

public class Standin implements IStar {
    private IActor actor;
    //替身是谁
    public Standin(IActor actor) {
        this.actor = actor;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}
