package com.aserendipper.demo.book.zenofdesignpattern.designpattern.adapterpattern.one;

public class Client {

    public static void main(String[] args) {
        //老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
        //只需要修改这一句代码
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

//    public static void main(String[] args) {
//        //没有与外系统连接的时候，是这样写的
//        IUserInfo youngGirl = new UserInfo();
//        //从数据库中查到101个
//        for (int i = 0; i < 101; i++) {
//            youngGirl.getMobileNumber();
//        }
//    }
}
