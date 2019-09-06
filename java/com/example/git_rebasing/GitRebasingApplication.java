package com.example.git_rebasing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class GitRebasingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitRebasingApplication.class, args);
	}

}
