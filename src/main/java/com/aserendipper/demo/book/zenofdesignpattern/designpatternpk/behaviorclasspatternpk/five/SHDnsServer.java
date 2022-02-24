package com.aserendipper.demo.book.zenofdesignpattern.designpatternpk.behaviorclasspatternpk.five;

public class SHDnsServer extends DnsServer {
    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }
}
