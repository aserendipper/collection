package com.aserendipper.demo.book.zenofdesignpattern.designpattern.compositepattern.five;

import java.util.ArrayList;

public class Leaf extends Component {
    @Override
    public void add(Component component) {
        //空实现，直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        //空实现
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayList<Component> getChildren() {
        //空实现
        throw new UnsupportedOperationException();
    }
}
