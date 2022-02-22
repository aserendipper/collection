package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.three;

public class Decorator implements Swan {
    private Swan swan;
    //修饰的是谁
    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desAppaearance() {
        swan.desAppaearance();
    }
}
