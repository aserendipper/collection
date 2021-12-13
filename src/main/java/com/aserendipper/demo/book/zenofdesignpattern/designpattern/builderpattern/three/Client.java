package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.three;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getCBMWModel().run();
        }
        for (int i = 0; i < 10; i++) {
            director.getDBMWModel().run();
        }
    }
}
