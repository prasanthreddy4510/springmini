package com.ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements ApplicationRunner,CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	ApplicationRunner appD() {
		return  args->System.out.println("application RUnner inside");
	}
    @Bean
	CommandLineRunner camD() {
		return args -> System.out.println("commadn line RUnners inside");
	}
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
