package com.guodaye.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//注册中心
public class MallRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallRegistryApplication.class, args);
    }
}
