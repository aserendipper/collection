package com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.nine;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.eight.RealSubject;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.eight.Subject;

public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
