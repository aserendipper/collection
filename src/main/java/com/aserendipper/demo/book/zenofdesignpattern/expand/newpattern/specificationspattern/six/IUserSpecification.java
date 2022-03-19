package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;

public interface IUserSpecification {
    //候选者是否满足
    public boolean isSatisfiledBy(Object user);
    //and操作
    public IUserSpecification and(IUserSpecification spec);
    //or操作
    public IUserSpecification or(IUserSpecification spec);
    //not操作
    public IUserSpecification not();
}
