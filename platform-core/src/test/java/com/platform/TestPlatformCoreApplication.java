package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestPlatformCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(PlatformCoreApplication::main).with(TestPlatformCoreApplication.class).run(args);
	}

}
