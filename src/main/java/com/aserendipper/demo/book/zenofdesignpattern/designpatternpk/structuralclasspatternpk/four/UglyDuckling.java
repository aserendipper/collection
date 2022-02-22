package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.four;

public class UglyDuckling extends WhiteSwan implements Duck {
    //丑小鸭的叫声
    @Override
    public void cry() {
        super.cry();
    }
    //丑小鸭的外形
    @Override
    public void desAppearance() {
        super.desAppaearance();
    }
    //丑小鸭的其他行为
    @Override
    public void desBehavior() {
        //丑小鸭不仅会游泳
        System.out.println("会游泳");
        //还会飞行
        super.fly();
    }
}
