package com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.six;

import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.two.ConcreteProduct1;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.two.ConcreteProduct2;
import com.aserendipper.demo.book.zenofdesignpattern.designpattern.factorymethodpattern.two.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type, product);
        }
        return product;
    }
}
