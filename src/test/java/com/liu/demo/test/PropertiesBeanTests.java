package com.liu.demo.test;

import com.liu.demo.test.domain.PropertiesBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 16:46
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesBeanTests {

    @Autowired
    private PropertiesBean propertiesBean;

    @Test
    public void loadBean(){
        System.out.println(propertiesBean);
    }
}
