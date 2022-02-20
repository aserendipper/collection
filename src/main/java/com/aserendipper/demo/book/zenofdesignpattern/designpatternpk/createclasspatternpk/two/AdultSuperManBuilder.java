package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.two;

public class AdultSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        superMan.setBody("强壮的躯体");
        superMan.setSpecialTalent("会飞行");
        superMan.setSpecialSymbol("胸前带S标记");
        return super.superMan;
    }
}
