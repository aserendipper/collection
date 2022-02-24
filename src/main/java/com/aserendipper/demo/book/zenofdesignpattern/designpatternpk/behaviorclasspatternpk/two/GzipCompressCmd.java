package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.two;

public class GzipCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.compress(source, to);
    }
}
