package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.OrderDetails;
import com.ashokit.repository.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		OrderDetailsRepo bean = context.getBean(OrderDetailsRepo.class);
		OrderDetails order=new OrderDetails();
		order.setName("avengers");
		order.setOrderPlacedDate(null);
		bean.save(order);
		context.close();
	}

}
