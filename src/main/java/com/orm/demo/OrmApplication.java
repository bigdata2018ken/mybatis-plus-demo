package com.orm.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.orm.demo.mapper","com.orm.demo.tb.mapper"})
public class OrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmApplication.class, args);
    }

}
