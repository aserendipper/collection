package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.Human;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
