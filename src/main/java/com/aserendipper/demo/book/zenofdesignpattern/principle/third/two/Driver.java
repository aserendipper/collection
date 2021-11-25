package com.aserendipper.demo.book.zenofdesignpattern.principle.third.two;

public class Driver implements IDriver {
    //司机的主要职责就是驾驶汽车
    @Override
    public void driver(ICar car) {
        car.run();
    }
}
