package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.four;

public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
