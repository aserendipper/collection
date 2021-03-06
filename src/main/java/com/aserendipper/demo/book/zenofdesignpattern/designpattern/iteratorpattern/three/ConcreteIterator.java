package com.aserendipper.demo.book.zenofdesignpattern.designpattern.iteratorpattern.three;

import java.util.Vector;

public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }
    //返回下一个元素
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }
    //判断是否到达尾部
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }
    //删除当前元素
    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
