package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
