package com.lx.dem.controller;

import com.lx.dem.domain.Test;
import com.lx.dem.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;
    /**
     * GET POST PUT DELETE
     * @return
     */
    @RequestMapping("/hello")//这个注解支持所有接收方式
    public String hello(){
        return "Hello World";
    }



    @RequestMapping("/test/list")//这个注解支持所有接收方式
    public List<Test> list(){
        return testService.list();
    }

}
