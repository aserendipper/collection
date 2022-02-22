package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.four;

public class Duckling implements Duck {
    @Override
    public void cry() {
        System.out.println("叫声是嘎--嘎--嘎");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是黄白相间，嘴长");
    }
    //鸭子的其他行为，如游泳
    @Override
    public void desBehavior() {
        System.out.println("会游泳");
    }
}
