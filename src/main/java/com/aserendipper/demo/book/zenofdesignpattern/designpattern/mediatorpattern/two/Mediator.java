package com.aserendipper.demo.book.zenofdesignpattern.designpattern.mediatorpattern.two;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyIBMcomputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellIBMComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSale();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    //采购电脑
    private void buyIBMcomputer(int number) {
        //电脑的销售情况
        int saleStatus = super.sale.getSaleStatus();
        //销售情况良好
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            stock.increase(number);
        } else {
            //销售情况不好
            //折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }
    //销售电脑
    private void sellIBMComputer(int number) {
        //库存数量不够销售
        if (super.stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    //折价处理
    public void offSale() {
        System.out.println("折价销售IBM电脑：" + stock.getStockNumber() + "台");
    }
    //清仓处理
    public void clearStock() {
        //要求清仓处理
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
