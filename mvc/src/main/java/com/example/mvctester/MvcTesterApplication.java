package com.example.mvctester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

// 비동기 활성화
@EnableAsync
@SpringBootApplication
public class MvcTesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcTesterApplication.class, args);
    }

}
