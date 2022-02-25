package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.three;

public class Position extends AbsColleague implements IPosition {
    public Position(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
