package com.zxtop.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.zxtop.cms"})
@SpringBootApplication
@MapperScan("com.zxtop.cms.dao")
public class CmsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsWebApplication.class, args);
    }
}
