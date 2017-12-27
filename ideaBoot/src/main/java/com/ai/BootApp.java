package com.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * boot启动类
 */
@SpringBootApplication
public class BootApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootApp.class,args);
    }
}
