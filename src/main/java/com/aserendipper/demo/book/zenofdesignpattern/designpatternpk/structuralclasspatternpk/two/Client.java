package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.one.IRunner;
import com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.one.Runner;

public class Client {
    public static void main(String[] args) {
        //定义运动员
        IRunner liu = new Runner();
        //对其功能加强
        liu = new RunnerWithJet(liu);
        //看看它的跑步情况如何
        System.out.println("===增强后的运动员的功能===");
        liu.run();
    }
}
