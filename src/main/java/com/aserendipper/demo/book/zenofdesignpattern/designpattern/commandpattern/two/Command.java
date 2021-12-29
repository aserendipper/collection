package com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.one.CodeGroup;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.one.PageGroup;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.commandpattern.one.RequirementGroup;

public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    //需求组
    protected RequirementGroup rg = new RequirementGroup();
    //美工组
    protected PageGroup pg = new PageGroup();
    //代码组
    protected CodeGroup cg = new CodeGroup();
    //只有一个方法，你要我做什么事情
    public abstract void execute();
}
