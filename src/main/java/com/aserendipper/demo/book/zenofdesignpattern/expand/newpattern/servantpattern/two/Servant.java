package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.servantpattern.two;

public class Servant {
    //服务内容
    public void service(IServiced serviceFuture) {
        serviceFuture.serviced();
    }
}
