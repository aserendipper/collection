package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public class UserByNameEqual extends CompositeSpecification {
    //基准姓名
    private String name;
    //构造函数传递基准姓名
    public UserByNameEqual(String name) {
        this.name = name;
    }
    //检验用户是否满足条件
    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
