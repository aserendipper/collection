package com.aserendipper.demo.book.zenofdesignpattern.designpattern.compositepattern.two;

import java.util.ArrayList;

public interface IBranch extends ICorp {
    //能够增加小兵（树叶节点）或者是经理（树枝节点）
    public void addSubordinate(ICorp corp);
    //我还要能够获得下属的信息
    public ArrayList<ICorp> getSubordinate();
}
