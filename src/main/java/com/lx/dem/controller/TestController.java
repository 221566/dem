package com.lx.dem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * GET POST PUT DELETE
     * @return
     */
    @RequestMapping("/hello")//这个注解支持所有接收方式
    public String hello(){
        return "Hello World";
    }

}
