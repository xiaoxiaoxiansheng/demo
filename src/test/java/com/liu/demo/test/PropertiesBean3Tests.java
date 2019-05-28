package com.liu.demo.test;

import com.liu.demo.test.domain.PropertiesBean2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 16:46
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesBean3Tests {

    @Autowired
    private Environment environment;

    @Test
    public void loadBean(){
        System.out.println("ceshi...");
        System.out.println(environment.getProperty("bean.name"));
    }
}
