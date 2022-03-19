package com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.expand.newpattern.specificationspattern.one.User;

public interface IUserSpecification {
    //候选者是否满足要求
    public boolean isSatisfiledBy(User user);
}
