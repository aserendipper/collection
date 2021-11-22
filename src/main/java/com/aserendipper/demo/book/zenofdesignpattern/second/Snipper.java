package com.aserendipper.demo.book.zenofdesignpattern.second;

public class Snipper {
    private AUG aug;

    public void setAug(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }
}

