package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public class OrSpecification extends CompositeSpecification {
    //传递两个规格书进行or操作
    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }
    //进行or运算
    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
