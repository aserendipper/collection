package com.aserendipper.demo.book.zenofdesignpattern.designpattern.compositepattern.five;

public class Client {
    //通过递归遍历树
    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
