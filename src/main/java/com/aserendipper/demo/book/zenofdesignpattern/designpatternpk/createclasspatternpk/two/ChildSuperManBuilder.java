package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.two;

public class ChildSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        superMan.setBody("强壮的躯体");
        superMan.setSpecialTalent("刀枪不入");
        superMan.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }
}
