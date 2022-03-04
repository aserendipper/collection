package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility;

public class LS extends AbstractLS {
    //参数为空
    @Override
    protected String getOperateParam() {
        return DEFAULT_PARAM;
    }
    //最简单的ls命令
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.getCommandName());
    }
}
