package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.three;

public interface CarFactory {
    //生产SUV
    public ICar createSuv();
    //生产商务车
    public ICar createVan();
}
