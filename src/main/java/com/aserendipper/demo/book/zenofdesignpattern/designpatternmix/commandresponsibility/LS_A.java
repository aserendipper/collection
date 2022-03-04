package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility;

public class LS_A extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }
    //ls -a命令
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.getCommandName());
    }
}
