package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.three;

public class Mediator extends AbsMediator {
    //工资增加了
    @Override
    public void up(ISalary salary) {
        upSalary();
        upTax();
    }
    //职位提升了
    @Override
    public void up(IPosition position) {
        upPosition();
        upSalary();
        upTax();
    }
    //税收增加了
    @Override
    public void up(ITax tax) {
        upTax();
        downSalary();
    }
    //工资降低了
    @Override
    public void down(ISalary salary) {
        downSalary();
        downTax();
    }
    //职位降低了
    @Override
    public void down(IPosition position) {
        downPostion();
        downSalary();
        downTax();
    }
    //税收降低了
    @Override
    public void down(ITax tax) {
        downTax();
        upSalary();
    }

    private void upSalary() {
        System.out.println("工资翻倍，乐翻天");
    }
    private void upTax() {
        System.out.println("税收上升，为国家做贡献");
    }
    private void upPosition() {
        System.out.println("职位上升一级，狂喜");
    }
    private void downSalary() {
        System.out.println("经济不景气，降低工资");
    }
    private void downTax() {
        System.out.println("税收减低，国家收入减少");
    }
    private void downPostion() {
        System.out.println("官降三级，比自杀还痛苦");
    }

}
