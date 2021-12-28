package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mediatorpattern.three;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
