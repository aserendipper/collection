package com.aserendipper.demo.book.zenofdesignpattern.designpattern.adapterpattern.one;

import java.util.Map;

public interface IOuterUser {
    //基本信息
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();
}
