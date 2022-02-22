package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.two;

import com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.structuralclasspatternpk.one.IRunner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
