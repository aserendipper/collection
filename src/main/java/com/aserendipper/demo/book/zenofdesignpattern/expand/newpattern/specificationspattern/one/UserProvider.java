package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {
    //用户列表
    private ArrayList<User> userList;
    //构造函数传递用户列表
    public UserProvider(ArrayList<User> userList) {
        this.userList = userList;
    }
    //姓名等于指定姓名的用户
    @Override
    public ArrayList<User> findUserByNameEqual(String name) {
        ArrayList<User> result = new ArrayList<>();
        for (User u : userList) {
            if (u.getName().equals(name)) {
                result.add(u);
            }
        }
        return result;
    }
    //年龄大于指定年龄的用户
    @Override
    public ArrayList<User> findUserByAgeThan(int age) {
        ArrayList<User> result = new ArrayList<>();
        for (User u : userList) {
            if (u.getAge() > age) {
                result.add(u);
            }
        }
        return result;
    }
}
