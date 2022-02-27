package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.factorymethodstrategy;

public class StrategyFactory {
    //策略工厂
    public static IDeduction getDeduction(StrategyMan strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction)Class.forName(strategy.getValue()).newInstance();
        } catch (Exception ignore) {
            //异常处理
        }
        return deduction;
    }
}
