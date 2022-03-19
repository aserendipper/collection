package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;

public class AndSpecification extends CompositeSpecification {
    //传递两个规格书进行and操作
    private IUserSpecification left;
    private IUserSpecification right;

    public AndSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }
    //进行and运算
    @Override
    public boolean isSatisfiledBy(Object user) {
        return left.isSatisfiledBy(user) && right.isSatisfiledBy(user);
    }
}
