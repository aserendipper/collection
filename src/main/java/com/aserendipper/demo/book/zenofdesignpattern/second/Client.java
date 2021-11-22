package com.aserendipper.demo.book.zenofdesignpattern.second;

import java.util.HashMap;

public class Client {
    //1.子类必须完全实现父类的方法
//    public static void main(String[] args) {
//        Soldier sanMao = new Soldier();
//        sanMao.setGun(new Rifle());
//        sanMao.killEnemy();
//    }
    //2.子类可以有自己的个性
//    public static void main(String[] args) {
//        Snipper sanMao = new Snipper();
//        sanMao.setAug(new AUG());
//        sanMao.killEnemy();
//    }
    //使用父类作为参数时会报错
//    public static void main(String[] args) {
//        Snipper sanMao = new Snipper();
//        sanMao.setAug((AUG)(new Rifle()));
//        sanMao.killEnemy();
//    }
    //3.覆盖或实现父类的方法时输入参数可以被放大
//    public static void invoker() {
//        //父类存在的地方，子类就应该能够存在
//        Father f = new Father();
//        HashMap map = new HashMap();
//        f.doSomething(map);
//    }
//    public static void main(String[] args) {
//        invoker();
//    }
    //子类替换父类后的源代码
    public static void invoker() {
        //父类存在的地方，子类就应该能够存在
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }
    public static void main(String[] args) {
        invoker();
    }


}
