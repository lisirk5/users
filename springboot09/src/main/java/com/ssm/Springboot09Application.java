package com.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("com.ssm")
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class Springboot09Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09Application.class, args);
    }

}
