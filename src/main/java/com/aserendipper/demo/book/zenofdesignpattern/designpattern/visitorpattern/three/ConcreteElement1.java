package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.three;

public class ConcreteElement1 extends Element {
    //完善业务逻辑
    @Override
    public void doSomething() {
        //业务处理
    }

    //允许哪个访问者访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
