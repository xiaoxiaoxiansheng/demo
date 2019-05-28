package com.liu.demo.test.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 16:33
 * @Description:
 */
@ConfigurationProperties(prefix = "bean")
@Component
public class PropertiesBean1 {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "bean{ " +
                "name = " + name +
                ", age = " + age + " }";
    }
}
