package com.ust.train.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wind
 * @date 2021/3/14 20:31
 * @sine 1.0
 */
@RestController
@RequestMapping("/home")
public class TestController {

    @RequestMapping("/index")
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Zhangsan");
        list.add("Lisi");
        list.add("Wangwu");
        return list;
    }

    @RequestMapping("/add/{a}/{b}")
    public int add(@PathVariable  int a, @PathVariable int b) {
        return a + b;
    }

}
