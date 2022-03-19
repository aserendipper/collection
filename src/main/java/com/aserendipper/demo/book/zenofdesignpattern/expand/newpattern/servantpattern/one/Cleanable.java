package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.servantpattern.one;

public interface Cleanable {
    //被清洁
    public void cleaned();
    //花园
    class Garden implements Cleanable {
        @Override
        public void cleaned() {
            System.out.println("花园被清洁干净");
        }
    }
    //厨房
    class Kitchen implements Cleanable {
        @Override
        public void cleaned() {
            System.out.println("厨房被清洁干净");
        }
    }
    //衣服
    class Cloth implements Cleanable {
        @Override
        public void cleaned() {
            System.out.println("衣服被清洁干净");
        }
    }
}
