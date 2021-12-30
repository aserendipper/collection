package com.aserendipper.demo.book.zenofdesignpattern.designpattern.proxypattern.five;

public interface IGamePlayer {
    public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    public IGamePlayer getProxy();
}
