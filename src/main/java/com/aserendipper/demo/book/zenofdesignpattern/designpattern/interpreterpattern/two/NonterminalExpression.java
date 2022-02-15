package com.aserendipper.demo.book.zenofdesignpattern.designpattern.interpreterpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.statepattern.three.Context;

public class NonterminalExpression extends Expression {
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expressions) {

    }
    @Override
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
}
