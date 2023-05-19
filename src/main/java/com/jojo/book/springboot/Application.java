package com.jojo.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    //aws 서버 설정중
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
