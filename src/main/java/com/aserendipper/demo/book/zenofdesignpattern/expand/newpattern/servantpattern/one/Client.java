package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.servantpattern.one;

public class Client {
    public static void main(String[] args) {
        //厨师清洁厨房
        Cleaner cookie = new Cleaner();
        cookie.clean(new Cleanable.Kitchen());
        //园丁清洁花园
        Cleaner gardener = new Cleaner();
        cookie.clean(new Cleanable.Garden());
        //裁缝清洁衣服
        Cleaner tailder = new Cleaner();
        cookie.clean(new Cleanable.Cloth());
    }
}
