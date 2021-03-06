package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.two;

public class TextMail extends MailTemplate {
    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }
    @Override
    public String getContext() {
        //文本类型设置邮件的格式为：text/plain
        String context = "\nContext-type： text/plain;charset=GB2312\n" + super.getContext();
        //同时对邮件进行base64编码处理，这里用一句话代替
        context = context + "\n邮件格式为： 文本格式";
        return context;
    }
}
