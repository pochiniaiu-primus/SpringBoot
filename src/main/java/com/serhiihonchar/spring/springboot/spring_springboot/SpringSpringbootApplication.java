package com.serhiihonchar.spring.springboot.spring_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.serhiihonchar.spring.springboot.spring_springboot")
public class SpringSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSpringbootApplication.class, args);
    }
}