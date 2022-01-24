package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.three;

public class LiSi implements Observer {
    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }
    private void reportToQinShiHuang(String reportContent) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了-->" + reportContent);
    }
}
