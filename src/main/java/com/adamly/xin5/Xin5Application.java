package com.adamly.xin5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.adamly.xin5"})
public class Xin5Application {

//   作为类的入口启动了整个项目
    public static void main(String[] args) {
        SpringApplication.run(Xin5Application.class, args);
    }

}
