package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.factorymethodstrategy;

public enum StrategyMan {
    SteadyDeduction("com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.factorymethodstrategy.SteadyDeduction"),
    FreeDeduction("com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.factorymethodstrategy.FreeDeduction");
    String value = "";

    StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
