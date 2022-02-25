package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.two;

public class Postfix extends MailServer {
    public Postfix(MailTemplate m) {
        super(m);
    }
    //修正邮件发送程序
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        String context = "Received：from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with" +
                "ESMTP id 2DBCD172B8\n";
        super.m.add(context);
        super.sendMail();
    }
}
