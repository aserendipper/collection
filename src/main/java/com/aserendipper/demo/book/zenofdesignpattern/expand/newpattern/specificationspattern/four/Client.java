package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.three.UserByNameLike;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.IUserProvider;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.IUserSpecification;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.UserByAgeThan;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.UserProvider;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        //定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);
        IUserSpecification userSpec1 = new UserByNameLike("%国庆%");
        IUserSpecification userSpec2 = new UserByAgeThan(20);
        userList = userProvider.findUser(userSpec1);
        for (User u: userProvider.findUser(userSpec2)) {
            System.out.println(u);
        }
    }
}
