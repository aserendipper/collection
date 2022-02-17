package com.aserendipper.demo.book.zenofdesignpattern.designpattern.flyweightpattern.five;

public class SignInfo {
    //报名人员的ID
    private String id;
    //邮寄地址
    private String postAddress;

    private ExtrinsicState extrinsicState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public ExtrinsicState getExtrinsicState() {
        return extrinsicState;
    }

    public void setExtrinsicState(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }
}
