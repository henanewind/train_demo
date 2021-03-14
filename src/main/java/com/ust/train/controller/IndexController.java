package com.ust.train.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wind
 * @date 2021/3/14 20:42
 * @sine 1.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("")
    public String hello() {
        return "index";
    }
}
