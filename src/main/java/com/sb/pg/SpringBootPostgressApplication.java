package com.sb.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.sb")
public class SpringBootPostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostgressApplication.class, args);
	}

}

