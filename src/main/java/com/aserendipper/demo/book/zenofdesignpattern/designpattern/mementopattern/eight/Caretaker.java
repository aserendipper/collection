package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mementopattern.eight;

public class Caretaker {
    //备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
