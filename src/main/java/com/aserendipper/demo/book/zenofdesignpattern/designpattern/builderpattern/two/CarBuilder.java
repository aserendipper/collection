package com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.builderpattern.one.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
