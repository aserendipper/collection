package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.three;

public class UglyDuckling implements Swan {
    //丑小鸭还比较小，不能飞
    @Override
    public void fly() {
        System.out.println("不能飞行");
    }
    //丑小鸭的叫声
    @Override
    public void cry() {
        System.out.println("叫声是克噜--克噜--克噜");
    }
    //丑小鸭的外形
    @Override
    public void desAppaearance() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}
