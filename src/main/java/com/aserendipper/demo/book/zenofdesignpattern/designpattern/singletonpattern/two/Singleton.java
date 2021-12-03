package com.aserendipper.demo.book.zenofdesignpattern.designpattern.singletonpattern.two;

/**
 * 饿汉式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton() {

    }
    //通过该方法获得实例对象
    public static Singleton getInstance() {
        return singleton;
    }
    //类中其他办法，尽量是static
    public static void doSomething() {

    }
}
