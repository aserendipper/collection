package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.six;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        IUserSpecification spec1 = new BizSpecification(new Object());
        IUserSpecification spec2 = new BizSpecification(new Object());
        for (Object obj:list) {
            //and操作
            if (spec1.and(spec2).isSatisfiledBy(obj)) {
                System.out.println(obj);
            }
        }
    }
}
