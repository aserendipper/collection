package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.four;

public class Car implements ICar {
    //汽车引擎
    private String engine;
    //汽车车轮
    private String wheel;
    //一次性传递汽车需要的信息
    public Car(String engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    @Override
    public String getWheel() {
        return null;
    }

    @Override
    public String getEngine() {
        return null;
    }

    @Override
    public String toString() {
        return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
    }
}
