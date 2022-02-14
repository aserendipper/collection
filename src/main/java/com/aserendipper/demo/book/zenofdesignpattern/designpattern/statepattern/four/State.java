package com.aserendipper.demo.book.zenofdesignpattern.designpattern.statepattern.four;

public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();

    public abstract void handle2();
}
