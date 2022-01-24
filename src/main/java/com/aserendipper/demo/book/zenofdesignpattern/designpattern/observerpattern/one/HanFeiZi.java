package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one;

public class HanFeiZi implements IHanFeiZi {
    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHavingBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHavingFun = false;
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.isHavingBreakfast = true;
    }
    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.isHavingFun = true;
    }
    //以下是bean的基本方法
    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
