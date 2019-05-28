package com.liu.demo.test.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 16:33
 * @Description:
 */
@Configuration//配置文件
@PropertySource("classpath:test.properties")//添加配置文件
@ConfigurationProperties(prefix = "test")//配置前缀
public class PropertiesBean2 {

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
        return "bean2{ " +
                "name = " + name +
                ", age = " + age + " }";
    }
}
