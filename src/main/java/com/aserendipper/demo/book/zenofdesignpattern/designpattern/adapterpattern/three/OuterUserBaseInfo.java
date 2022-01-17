package com.aserendipper.demo.book.zenofdesignpattern.designpattern.adapterpattern.three;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王");
        baseInfoMap.put("mobileNumber", "这个员工的电话是...");
        return baseInfoMap;
    }
}
