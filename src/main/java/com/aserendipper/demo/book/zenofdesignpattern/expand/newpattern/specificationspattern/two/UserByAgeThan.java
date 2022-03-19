package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public class UserByAgeThan implements IUserSpecification {
    //基准姓名
    private int age;
    //构造函数传递基准姓名
    public UserByAgeThan(int age) {
        this.age = age;
    }
    //检验用户是否满足条件
    @Override
    public boolean isSatisfiledBy(User user) {
        return user.getAge() > age;
    }
}
