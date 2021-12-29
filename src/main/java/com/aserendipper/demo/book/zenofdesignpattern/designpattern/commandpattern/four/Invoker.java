package com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.four;

public class Invoker {
    private Command command;
    //受气包，接受命令
    public void setCommand(Command command) {
        this.command = command;
    }
    //执行命令
    public void action() {
        this.command.execute();;
    }
}
