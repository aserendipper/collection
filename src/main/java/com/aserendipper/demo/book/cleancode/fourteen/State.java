package com.aserendipper.demo.book.cleancode.fourteen;

public enum State {
    NEW(0) {
        @Override
        void run() {
            System.out.println("0");
        }
    },
    RUNNABLE(1) {
        @Override
        void run() {
            System.out.println("1");
        }
    };

    public int statusCode;
    abstract void run();
    State(int statusCode) {
        this.statusCode = statusCode;
    }
}
