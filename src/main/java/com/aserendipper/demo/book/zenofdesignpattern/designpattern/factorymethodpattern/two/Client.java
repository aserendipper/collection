package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.two;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);

    }
}
