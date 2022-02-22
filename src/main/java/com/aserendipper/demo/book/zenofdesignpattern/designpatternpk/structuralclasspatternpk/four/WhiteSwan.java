package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.three.Swan;

public class WhiteSwan implements Swan {
    //白天鹅的叫声
    @Override
    public void fly() {
        System.out.println("叫声是克噜--克噜--克噜");
    }
    //白天鹅的外形
    @Override
    public void cry() {
        System.out.println("外形是纯白色，惹人喜爱");
    }
    //天鹅是能够飞行的
    @Override
    public void desAppaearance() {
        System.out.println("能够飞行");
    }
}
