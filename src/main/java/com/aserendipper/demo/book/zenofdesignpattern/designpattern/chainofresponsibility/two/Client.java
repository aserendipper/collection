package com.aserendipper.demo.book.zenofdesignpattern.designpattern.chainofresponsibility.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.chainofresponsibility.one.IWomen;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //随便挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请求对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
