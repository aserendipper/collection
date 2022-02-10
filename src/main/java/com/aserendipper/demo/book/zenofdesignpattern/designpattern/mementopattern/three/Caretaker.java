package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mementopattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.mementopattern.two.Memento;

public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
