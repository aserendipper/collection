package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.one;

public class HtmlMail extends MailTemplate {
    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }
    @Override
    public String getContext() {
        //文本类型设置邮件的格式为：multipart/mixed
        String context = "\nContext-type： multipart/mixed;charset=GB2312\n" + super.getContext();
        //同时对邮件进行base64编码处理，这里用一句话代替
        context = context + "\n邮件格式为： 超文本格式";
        return context;
    }
}
