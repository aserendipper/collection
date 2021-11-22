package com.aserendipper.demo.book.zenofdesignpattern.second;

public class AUG extends Rifle {
    public void zoomOut() {
        System.out.println("通过望远镜擦看敌人");
    }
    @Override
    public void shoot() {
        System.out.println("AUG射击");
    }
}
