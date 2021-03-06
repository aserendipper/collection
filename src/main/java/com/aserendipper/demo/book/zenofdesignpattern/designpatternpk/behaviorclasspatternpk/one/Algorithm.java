package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.one;

public interface Algorithm {
    //压缩算法
    public boolean compress(String source, String to);
    //解压缩算法
    public boolean uncompress(String source, String to);
}
