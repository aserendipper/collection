package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.two;

public interface IReceiver {
    //压缩
    public boolean compress(String source, String to);
    //解压缩
    public boolean uncompress(String source, String to);
}
