package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mementopattern.seven;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.mementopattern.six.Memento;

import java.util.HashMap;

public class Caretaker {
    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
