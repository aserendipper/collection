package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;

public class NotSpecification extends CompositeSpecification {
    //传递一个规格书
    private IUserSpecification spec;

    public NotSpecification(IUserSpecification spec) {
        this.spec = spec;
    }
    //进行not运算
    @Override
    public boolean isSatisfiledBy(Object user) {
        return !spec.isSatisfiledBy(user);
    }
}
