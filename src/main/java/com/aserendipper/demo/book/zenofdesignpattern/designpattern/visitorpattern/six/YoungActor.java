package com.aserendipper.demo.book.zenofdesignpattern.designpattern.visitorpattern.six;

public class YoungActor extends AbsActor {
    //年轻演员最喜欢演功夫戏
    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢演功夫角色");
    }
}
