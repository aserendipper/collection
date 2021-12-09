package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.four;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.BlackHuman;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.one.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
