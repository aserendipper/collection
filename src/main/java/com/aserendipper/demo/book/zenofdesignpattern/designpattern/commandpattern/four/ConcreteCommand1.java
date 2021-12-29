package com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.three.ConcreteReciver1;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.three.Receiver;

public class ConcreteCommand1 extends Command {
    //声明自己的默认接收者
    public ConcreteCommand1() {
        super(new ConcreteReciver1());
    }
    //设置新的接收者
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }
    //每个具体的命令都必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
