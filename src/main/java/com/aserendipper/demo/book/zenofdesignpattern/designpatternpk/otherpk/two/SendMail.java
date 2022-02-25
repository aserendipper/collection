package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.two;

public class SendMail extends MailServer {
    public SendMail(MailTemplate m) {
        super(m);
    }
    //修正邮件发送程序
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        super.m.add("Received：(sendmail); 7 Nov 2009 04:14:44 +0100");
        super.sendMail();
    }
}
