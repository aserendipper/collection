package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.four;

public class Client {
    public static void main(String[] args) {
        //鸭妈妈有5个孩子，其中4个都是一个模样
        System.out.println("===妈妈有五个孩子，其中四个模样是这样的：===");
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        System.out.println("\n===一只独特的小鸭子，模样是这样的===");
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
