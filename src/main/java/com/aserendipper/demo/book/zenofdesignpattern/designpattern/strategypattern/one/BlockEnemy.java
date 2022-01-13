package com.aserendipper.demo.book.zenofdesignpattern.designpattern.strategypattern.one;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
