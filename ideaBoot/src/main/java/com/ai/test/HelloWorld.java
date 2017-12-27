package com.ai.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ideaboot测试
 */
@Controller
class HelloWorld {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "你好我是你大哥";
    }

    @ResponseBody
    @RequestMapping(value = "/add")
    public String add() {
        return "git测试";
    }
}
