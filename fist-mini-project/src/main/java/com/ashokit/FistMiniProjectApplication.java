package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FistMiniProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex=SpringApplication.run(FistMiniProjectApplication.class, args);
		
	}

}
