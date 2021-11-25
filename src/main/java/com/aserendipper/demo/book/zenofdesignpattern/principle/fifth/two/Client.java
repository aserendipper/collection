package com.aserendipper.demo.book.zenofdesignpattern.principle.fifth.two;

import com.aserendipper.demo.book.zenofdesignpattern.principle.fifth.one.Girl;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Girl> listGirls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(listGirls));
    }
}
