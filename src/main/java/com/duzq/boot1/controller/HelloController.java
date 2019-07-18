package com.duzq.boot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RestController // 相当于给声明的方法中，都加上 @ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello spring boot");
        return "index";
    }

}
