package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.BenzModel;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
