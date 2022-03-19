package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public interface IUserSpecification {
    //候选者是否满足
    public boolean isSatisfiedBy(User user);
    //and操作
    public IUserSpecification and(IUserSpecification spec);
    //or操作
    public IUserSpecification or(IUserSpecification spec);
    //not操作
    public IUserSpecification not();
}
