package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.createclasspatternpk.four;

public class Director {
    //声明对建造者的引用
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();
    //生产奔驰SUV
    public ICar createBenzSUV() {
        //制造出汽车
        return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
    }
    //生产出一辆宝马商务车
    public ICar createBMWVan() {
        return createCar(bmwBuilder, "BMW的引起", "BMW的轮胎");
    }
    //生产出一个混合车型
    public ICar createComplexCar() {
        return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
    }
    //生产车辆
    private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
        //导演怀揣蓝图
        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);
        System.out.println("获得生产蓝图");
        carBuilder.receiveBlueprint(bp);
        return carBuilder.buildCar();
    }
}
