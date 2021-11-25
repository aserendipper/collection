package com.aserendipper.demo.book.zenofdesignpattern.principle.second;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
    public Collection doSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
