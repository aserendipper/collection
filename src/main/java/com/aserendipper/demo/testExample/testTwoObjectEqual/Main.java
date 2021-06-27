package com.aserendipper.demo.testExample.testTwoObjectEqual;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("zhangsan", "123456");
        User user2 = new User("zhangsan", "123456");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user1.toString().equals(user2.toString()));
        System.out.println(user1.equals(user2));
    }
}
