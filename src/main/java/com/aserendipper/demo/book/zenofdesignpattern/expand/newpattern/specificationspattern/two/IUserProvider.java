package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

import java.util.ArrayList;

public interface IUserProvider {
    //根据条件查找用户
    public ArrayList<User> findUser(IUserSpecification userSpec);
}
