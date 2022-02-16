package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.seven;

public class KungFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
