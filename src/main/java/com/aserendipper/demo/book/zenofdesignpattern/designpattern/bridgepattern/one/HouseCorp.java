package com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.one;

public class HouseCorp extends Corp {
    //房地产公司盖房子
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }
    //房地产公司卖房子，自己住那可不赚钱
    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }
    //房地产公司很High了，赚钱，计算利润
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
