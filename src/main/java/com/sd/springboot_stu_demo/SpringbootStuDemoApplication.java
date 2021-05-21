package com.sd.springboot_stu_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sd")
@MapperScan("com.sd.dao")
public class SpringbootStuDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStuDemoApplication.class, args);
    }

}
