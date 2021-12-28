package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mediatorpattern.two;

public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
