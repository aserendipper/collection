package com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.five;

public class RefinedAbstraction extends Abstraction {
    //覆写构造函数
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }
    //修正父类的行为
    @Override
    public void request() {
        /**
         * 业务处理
         */
        super.request();
        super.getImp().doAnything();
    }
}
