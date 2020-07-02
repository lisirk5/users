package com.ssm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot10Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Springboot10Application.class, args);

    }

}
