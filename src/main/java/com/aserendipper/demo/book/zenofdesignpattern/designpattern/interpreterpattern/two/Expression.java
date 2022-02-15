package com.aserendipper.demo.book.zenofdesignpattern.designpattern.interpreterpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.statepattern.three.Context;

public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
