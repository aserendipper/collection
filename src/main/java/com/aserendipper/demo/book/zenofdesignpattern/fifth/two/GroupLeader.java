package com.aserendipper.demo.book.zenofdesignpattern.fifth.two;

import com.aserendipper.demo.book.zenofdesignpattern.fifth.one.Girl;

import java.util.List;

public class GroupLeader {
    private List<Girl> listGirls;
    public GroupLeader(List<Girl> _listGirls) {
        this.listGirls = _listGirls;
    }
    public void countGirls() {
        System.out.println("女生数量是:" + this.listGirls.size());
    }
}
