package com.aserendipper.demo.book.zenofdesignpattern.designpattern.prototypepattern.three;

public class PrototypeClass implements Cloneable {
    //覆写父类的Object方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
