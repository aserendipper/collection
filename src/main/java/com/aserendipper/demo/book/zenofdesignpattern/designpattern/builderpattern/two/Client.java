package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.BMWModel;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.BenzModel;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        benzBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }
}
