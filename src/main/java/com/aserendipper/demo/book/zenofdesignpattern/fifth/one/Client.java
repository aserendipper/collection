package com.aserendipper.demo.book.zenofdesignpattern.fifth.one;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //老师发布命令
        teacher.commond(new GroupLeader());
    }
}
