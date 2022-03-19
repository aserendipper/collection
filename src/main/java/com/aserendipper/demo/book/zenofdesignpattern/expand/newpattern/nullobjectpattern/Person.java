package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.nullobjectpattern;

public class Person {
    public void hear(Animal animal) {
        if (animal != null) {
            animal.makeSound();
        }
    }
}
