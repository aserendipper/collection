package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.five;

public class Idolater {
    public static void main(String[] args) {
        //崇拜的明星是谁
        IStar star = new Singer();
        //找到明星的经纪人
        IStar agent = new Agent(star);
        System.out.println("追星族：我是你的崇拜者，请签名！");
        //签字
        agent.sign();
    }
}
