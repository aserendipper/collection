package com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.three.House;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.three.HouseCorp;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.three.IPod;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.bridgepattern.three.ShanZhaiCorp;

public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("------房地产公司是这样运行的------");
        //先找到房地产公司
        HouseCorp houseCor = new HouseCorp(house);
        //看我怎么挣钱
        houseCor.makeMoney();
        System.out.println("\n");
        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("------山寨公司是这样运行的------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMoney();
    }
}
