package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility.df;

import com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility.CommandVO;

public class DF_G extends AbstractDF {
    //定义一下自己能处理什么参数
    @Override
    protected String getOperateParam() {
        return G_PARAM;
    }
    //命令处理
    @Override
    protected String echo(CommandVO vo) {
        return DiskManager.df_g();
    }
}
