package com.aserendipper.demo.book.zenofdesignpattern.designpattern.abstractfactorypattern.two;

public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        //只生产产品等级为1的A产品
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        //只生产产品等级为1的B产品
        return new ProductB1();
    }
}
