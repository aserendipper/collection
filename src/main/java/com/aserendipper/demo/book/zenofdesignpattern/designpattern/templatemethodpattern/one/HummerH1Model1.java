package com.aserendipper.demo.book.zenofdesignpattern.designpattern.templatemethodpattern.one;

public class HummerH1Model1 extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
}
