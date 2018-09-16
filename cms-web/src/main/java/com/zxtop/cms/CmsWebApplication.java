package com.zxtop.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.zxtop"})
@SpringBootApplication
public class CmsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsWebApplication.class, args);
    }
}
