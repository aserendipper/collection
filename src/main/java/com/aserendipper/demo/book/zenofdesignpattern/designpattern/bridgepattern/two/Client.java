package com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.one.ClothesCorp;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.one.HouseCorp;

public class Client {
    public static void main(String[] args) {
        System.out.println("------房地产公司是这样运行的------");
        //先找到我的公司
        HouseCorp houseCorp = new HouseCorp();
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("------山寨公司是这样运行的------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}
