package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public class UserByAgeThan extends CompositeSpecification {
    //基准姓名
    private int age;
    //构造函数传递基准姓名
    public UserByAgeThan(int age) {
        this.age = age;
    }
    //检验用户是否满足条件
    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
