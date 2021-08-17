package com.lx.dem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemApplication {

    public static void main(String[] args) {
        System.out.println("测试");
        SpringApplication.run(DemApplication.class, args);
    }

}
