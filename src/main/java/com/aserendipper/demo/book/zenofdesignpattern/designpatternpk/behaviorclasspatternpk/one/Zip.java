package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.one;

public class Zip implements Algorithm {
    //ZIP格式的压缩算法
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP压缩成功！");
        return true;
    }
    //ZIP格式的解压缩算法
    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP解压缩成功！");
        return true;
    }
}
