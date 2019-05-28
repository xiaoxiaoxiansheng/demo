package com.liu.demo.test.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 16:33
 * @Description:
 */
@Component
public class PropertiesBean {
    @Value("${bean.name}")
    private String name;
    @Value("${bean.age}")
    private int age;

    @Override
    public String toString() {
        return "bean{ " +
                "name = " + name +
                ", age = " + age + " }";
    }
}
