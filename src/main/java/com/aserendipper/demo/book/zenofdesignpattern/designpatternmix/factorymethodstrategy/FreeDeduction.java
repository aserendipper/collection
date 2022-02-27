package com.aserendipper.demo.book.zenofdesignpattern.designpatternmix.factorymethodstrategy;

public class FreeDeduction implements IDeduction {
    //自由扣款
    @Override
    public boolean exec(Card card, Trade trade) {
        //直接从自由余额中扣除
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
