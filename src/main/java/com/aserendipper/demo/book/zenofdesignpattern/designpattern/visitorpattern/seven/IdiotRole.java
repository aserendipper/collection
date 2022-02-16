package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.seven;

public class IdiotRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
