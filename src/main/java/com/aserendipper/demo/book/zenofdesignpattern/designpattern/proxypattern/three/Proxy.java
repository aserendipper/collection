package com.aserendipper.demo.book.zenofdesignpattern.designpattern.proxypattern.three;

public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    //通过构造函数传递代理者
    private Proxy(Object...objects) {
    }
    private Proxy(Subject subject) {
        this.subject = subject;
    }
    //实现接口中定义的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    private void before() {
        //do something
    }
    //稍后处理
    private void after(){
        //do something
    }
}
