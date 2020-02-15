package com.gbicc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: UserApplication
 * @author: ding
 * @date: 2020/2/14 17:38
 * @version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
