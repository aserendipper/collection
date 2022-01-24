package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one.IHanFeiZi;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one.ILisi;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one.LiSi;

public class HanFeiZi implements IHanFeiZi {
    private ILisi liSi = new LiSi();
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        //通知李斯
        this.liSi.update("韩非子在吃饭");
    }
    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}
