package com.aserendipper.demo.book.zenofdesignpattern.principle.fifth.one;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //老师发布命令
        teacher.commond(new GroupLeader());
    }
}
