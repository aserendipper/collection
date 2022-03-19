package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;


public abstract class CompositeSpecification implements IUserSpecification {
    //是否满足条件由实现类实现
    @Override
    public abstract boolean isSatisfiledBy(Object user);
    
    @Override
    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this, spec);
    }

    @Override
    public IUserSpecification or(IUserSpecification spec) {
        return new OrSpecification(this, spec);
    }

    @Override
    public IUserSpecification not() {
        return new NotSpecification(this);
    }
}
