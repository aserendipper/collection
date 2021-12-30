package com.aserendipper.demo.book.zenofdesignpattern.designpattern.chainofresponsibility.one;

public interface IHandler {
    //一个女性要求逛街，需要处理这个请求
    public void HandleMessage(IWomen women);
}
