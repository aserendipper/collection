package com.aserendipper.demo.book.zenofdesignpattern.fifth.three;

public class Client {
    public static void main(String[] args) {
        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }
}
