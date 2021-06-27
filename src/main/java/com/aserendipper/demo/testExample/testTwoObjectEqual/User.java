package com.aserendipper.demo.testExample.testTwoObjectEqual;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String name;
    private String phone;

    @Override
    public boolean equals(Object obj) {
        //使用 == 判断obj是否为这个对象的引用
        if (obj == this) {
            return true;
        }
        //使用 instanceof 判断obj的类型是否正确
        if (!(obj instanceof User)) {
            return false;
        }
        //把参数转成对应类型
        User user = (User) obj;
        //判断字段是否相同
        return Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + phone.hashCode();
        return result;
    }
}
