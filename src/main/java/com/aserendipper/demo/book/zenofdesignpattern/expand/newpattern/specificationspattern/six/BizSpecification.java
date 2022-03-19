package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;

public class BizSpecification extends CompositeSpecification {
    //基准对象
    private Object obj;

    public BizSpecification(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiledBy(Object user) {
        //根据基准对象和候选对象，进行业务判断，返回boolean
        return false;
    }
}
