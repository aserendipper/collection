package com.aserendipper.demo.book.zenofdesignpattern.designpattern.singletonpattern.three;

/**
 *
 * 懒汉式
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {

    }
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
