package com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.observerpattern.one.IHanFeiZi;

import java.util.ArrayList;

public class HanFeiZi implements Observable, IHanFeiZi {
    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<>();
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.notifyObservers("韩非子在吃饭");
    }
    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }
    //增加观察者
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }
    //删除观察者
    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }
    //通知所有的观察者
    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }
}
