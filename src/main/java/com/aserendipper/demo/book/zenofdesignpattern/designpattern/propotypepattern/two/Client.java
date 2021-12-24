package com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.one.GamePlayer;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.one.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2009-8-26 10:45");
    }
}
