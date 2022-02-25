package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.three;

public abstract class AbsColleague {
    //每个同事类都对中介者非常了解
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }
}
