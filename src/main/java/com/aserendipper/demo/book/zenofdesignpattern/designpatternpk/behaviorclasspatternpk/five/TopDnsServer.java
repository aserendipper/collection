package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.five;

public class TopDnsServer extends DnsServer {
    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("全球顶级DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return true;
    }
}
