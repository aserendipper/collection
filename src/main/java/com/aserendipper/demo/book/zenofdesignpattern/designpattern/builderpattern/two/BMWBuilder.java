package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.BMWModel;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
