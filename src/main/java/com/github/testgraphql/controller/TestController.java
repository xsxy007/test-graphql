package com.github.testgraphql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试 graphql servlet  和 springmvc  能否并存
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test() {
        return "test";
    }
}
