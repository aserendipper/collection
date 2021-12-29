package com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.two;

public class DeletePageCommand extends Command {
    //执行删除一个页面的命令
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.rg.delete();
        //给出计划
        super.rg.plan();
    }
}
