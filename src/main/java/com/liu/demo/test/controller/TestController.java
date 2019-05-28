package com.liu.demo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuj
 * @Date: 2019/5/28 15:15
 * @Description:测试
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("hello, Test.");
        return "Hello, test.";
    }
}
