package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public class UserByNameEqual implements IUserSpecification {
    //基准姓名
    private String name;
    //构造函数传递基准姓名
    public UserByNameEqual(String name) {
        this.name = name;
    }
    //检验用户是否满足条件
    @Override
    public boolean isSatisfiledBy(User user) {
        return user.getName().equals(name);
    }
}
