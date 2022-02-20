package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.three;

public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "奔驰汽车";

    @Override
    public String getBand() {
        return BENZ_BAND;
    }
    //具体型号由实现类完成
    @Override
    public abstract String getModel();
}
