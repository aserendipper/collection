package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.four;

public class BenzBuilder extends CarBuilder {
    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
