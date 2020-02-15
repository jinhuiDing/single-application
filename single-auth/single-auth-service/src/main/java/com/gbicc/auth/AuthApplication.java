package com.gbicc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.JedisPool;

/**
 * @description: AuthApplication
 * @author: ding
 * @date: 2020/2/15 22:21
 * @version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Bean
    public JedisPool jedisPool() {
        return new JedisPool("127.0.0.1", 6379);
    }
}
