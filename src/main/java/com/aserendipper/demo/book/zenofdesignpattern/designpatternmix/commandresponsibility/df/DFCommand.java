package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility.df;

import com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility.Command;
import com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.commandresponsibility.CommandVO;

public class DFCommand extends Command {

    @Override
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
    }
}
