package com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.three.Product;

public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的衣服是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}
