package com.test.automation_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"config"})
public class AutomationCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationCoreApplication.class, args);
	}

}
