package com.aserendipper.demo.book.zenofdesignpattern.designpattern.compositepattern.one;

import java.util.ArrayList;

public interface IBranch {
    //获取信息
    public String getInfo();
    //增加数据节点，例如研发部下设的研发一组
    public void add(IBranch iBranch);
    //增加叶子节点
    public void add(ILeaf iLeaf);
    //获得下级信息
    public ArrayList getSubordinateInfo();
}
