package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.three;

public class BeautifyAppearance extends Decorator {
    //要美化谁
    public BeautifyAppearance(Swan swan) {
        super(swan);
    }
    //外表美化处理
    @Override
    public void desAppaearance() {
        System.out.println("外表是纯白色的，非常惹人喜爱！");
    }
}
