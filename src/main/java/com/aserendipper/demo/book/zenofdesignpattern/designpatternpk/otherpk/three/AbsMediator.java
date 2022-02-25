package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.otherpk.three;

public abstract class AbsMediator {
    //工资
    protected final ISalary salary;
    //职位
    protected final IPosition position;
    //税收
    protected final ITax tax;

    public AbsMediator() {
        this.salary = new Salary(this);
        this.position = new Position(this);
        this.tax = new Tax(this);
    }
    //工资增加了
    public abstract void up(ISalary salary);
    //职位提升了
    public abstract void up(IPosition position);
    //税收增加了
    public abstract void up(ITax tax);
    //工资降低了
    public abstract void down(ISalary salary);
    //职位降低了
    public abstract void down(IPosition position);
    //税收降低了
    public abstract void down(ITax tax);
}
