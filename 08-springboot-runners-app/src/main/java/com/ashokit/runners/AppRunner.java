package com.ashokit.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
       int a=10;
       int b=20;
       int c=a+b;
       
		System.out.println("application runneres outside");
	}

}
