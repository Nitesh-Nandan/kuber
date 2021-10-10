package com.kuber.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.kuber.*")
@PropertySource("classpath:app.properties")
@PropertySource("classpath:common.properties")
@PropertySource("classpath:dao.properties")
@PropertySource("classpath:web.properties")
@EnableScheduling
@Slf4j
public class AppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
