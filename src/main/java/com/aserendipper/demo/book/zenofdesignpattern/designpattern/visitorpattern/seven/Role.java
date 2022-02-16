package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.seven;

public interface Role {
    //演员要扮演的角色
    public void accept(AbsActor actor);
}
