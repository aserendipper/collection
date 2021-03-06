package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.one;

public class Gzip implements Algorithm {
    //gzip的压缩算法
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP压缩成功！");
        return true;
    }
    //gzip的解压缩算法
    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP解压缩成功！");
        return true;
    }
}
