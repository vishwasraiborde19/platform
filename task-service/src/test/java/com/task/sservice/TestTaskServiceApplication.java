package com.task.sservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTaskServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(TaskServiceApplication::main).with(TestTaskServiceApplication.class).run(args);
    }

}
