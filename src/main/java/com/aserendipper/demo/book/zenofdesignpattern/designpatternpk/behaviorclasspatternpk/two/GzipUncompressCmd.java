package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.two;

public class GzipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.uncompress(source, to);
    }
}
