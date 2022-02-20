package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.three;

public class BenzVan extends AbsBenz {
    private final static String R_SERIES = "R系列商务车";
    @Override
    public String getModel() {
        return R_SERIES;
    }
}
