package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.three;

public class Client {
    public static void main(String[] args) {
        //定义中介者
        Mediator mediator = new Mediator();
        //定义各个同事类
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);
        //职位提升了
        System.out.println("===职位提升了===");
        position.promote();
    }
}
