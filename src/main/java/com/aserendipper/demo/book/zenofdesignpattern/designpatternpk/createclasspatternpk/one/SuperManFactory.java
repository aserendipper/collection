package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.one;

public class SuperManFactory {
    //定义一个生产超人的工厂
    public static ISuperMan createSuperMan(String type) {
        //根据输入参数产生不同的超人
        if ("adult".equalsIgnoreCase(type)) {
            //生产成人超人
            return new AdultSuperMan();
        } else if ("child".equalsIgnoreCase(type)) {
            //生产未成年超人
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
