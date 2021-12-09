package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.BlackHuman;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.Human;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.WhiteHuman;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.YellowHuman;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--造出的第三批人是黄色人种--");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
