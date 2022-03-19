package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.five;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.IUserProvider;
import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two.UserProvider;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //首先初始化一批用户
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("苏国庆", 23));
        userList.add(new User("国庆牛", 82));
        userList.add(new User("张国庆三", 10));
        userList.add(new User("李四", 10));
        //定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);
        //打印名字包含"国庆"的人员
        System.out.println("===名字包含国庆的人员===");
        //定义一个规格书
        IUserSpecification spec = new UserByAgeThan(25);
        IUserSpecification spec2 = new UserByNameEqual("%国庆%");
//        for (User u:userProvider.findUser(spec.and(spec2))) {
//            System.out.println(u);
//        }
    }
}
