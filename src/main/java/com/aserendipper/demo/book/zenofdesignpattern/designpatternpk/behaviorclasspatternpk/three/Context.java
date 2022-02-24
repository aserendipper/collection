package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.three;

public class Context {
    private WorkAlgorithm workMethod;

    public WorkAlgorithm getWork() {
        return workMethod;
    }

    public void setWork(WorkAlgorithm workMethod) {
        this.workMethod = workMethod;
    }
    //每个算法都有必须具有的功能
    public void work() {
        workMethod.work();
    }
}
