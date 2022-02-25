package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.four;

import java.util.Random;

public class Tax {
    //收取多少税金
    public int getTax() {
        //交纳一个随机数量的税金
        return (new Random()).nextInt(300);
    }
}
