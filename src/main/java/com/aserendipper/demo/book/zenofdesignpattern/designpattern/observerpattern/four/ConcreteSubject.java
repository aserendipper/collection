package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.four;

public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething(){
        /**
         * do something
         */
        super.notifyObservers();
    }
}
