package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility;

public class LS_L extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }
    //l选项
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.getCommandName());
    }
}
