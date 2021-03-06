package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.three;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.Human;

public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
