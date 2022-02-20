package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.three;

public class BenzFactory implements CarFactory {
    //生产SUV
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }
    //生产商务车
    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
