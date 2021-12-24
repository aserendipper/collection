package com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.propotypepattern.one.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayerProxy("张三");
        System.out.println("开始时间是：2009-8-25 10:45");
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：2009-8-26 10:45");
    }
}
