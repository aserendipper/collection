package com.aserendipper.demo.book.zenofdesignpattern.designpattern.prototypepattern.four;

public class Client {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
