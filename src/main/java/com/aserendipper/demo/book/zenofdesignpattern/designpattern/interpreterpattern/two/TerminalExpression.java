package com.aserendipper.demo.book.zenofdesignpattern.designpattern.interpreterpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.statepattern.three.Context;

public class TerminalExpression extends Expression {
    //通常终结符表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
