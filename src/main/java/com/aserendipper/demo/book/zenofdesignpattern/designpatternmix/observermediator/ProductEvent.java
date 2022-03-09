package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.observermediator;

import java.util.Observable;

public class ProductEvent extends Observable {
    //事件起源
    private Product source;
    //事件的类型
    private ProductEventType type;
    //传入事件的源头，默认为新建类型
    public ProductEvent(Product p) {
        this.source = source;
    }
    //事件源头以及事件类型
    public ProductEvent(Product p, ProductEventType type) {
        this.source = p;
        this.type = type;
        //事件触发
        notifyEventDispatch();
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getEventType() {
        return this.type;
    }
    //通知事件处理中心
    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
