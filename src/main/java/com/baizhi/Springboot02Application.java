package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value="com.baizhi.dao")
public class Springboot02Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);
    }

}
