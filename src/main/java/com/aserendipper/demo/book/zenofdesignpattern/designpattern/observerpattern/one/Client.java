package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one;

public class Client {
    public static void main(String[] args) throws Exception {
        //定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        //观察早餐
        Spy spyBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
        //开始启动线程，监控
        spyBreakfast.start();
        //观察娱乐活动
        Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
        spyFun.start();
        //然后我们看看韩非子在干什么
        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();
        //韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
