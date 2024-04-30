package com.platform.platformserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlatformServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformServiceRegistryApplication.class, args);
    }
}
