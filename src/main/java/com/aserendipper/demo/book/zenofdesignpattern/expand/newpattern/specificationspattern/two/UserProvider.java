package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {
    //用户列表
    private ArrayList<User> userList;
    //构造函数传递用户列表
    public UserProvider(ArrayList<User> userList) {
        this.userList = userList;
    }
    //根据指定的规格书查找用户
    @Override
    public ArrayList<User> findUser(IUserSpecification userSpec) {
        ArrayList<User> result = new ArrayList<>();
        for (User u : userList) {
            if (userSpec.isSatisfiledBy(u)) {
                result.add(u);
            }
        }
        return result;
    }
}
