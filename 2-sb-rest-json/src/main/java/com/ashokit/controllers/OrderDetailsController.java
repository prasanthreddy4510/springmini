package com.ashokit.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.OrderDetails;

@RestController
public class OrderDetailsController {

	@GetMapping(value= {"/order/{ordn}"})
	public OrderDetails order(@PathVariable("ordn")String orderNumber) {
		OrderDetails orderDetails=new OrderDetails();
		Date date=new Date();
		if("11-22-4233".equals(orderNumber)) {
		orderDetails.setOrderDate(date);
		orderDetails.setOrderTotal(1335.51);
		}
		else if("22-333".equals(orderNumber)) {
			orderDetails.setOrderDate(date);
			orderDetails.setOrderTotal(121.3);
		}
		return orderDetails;
		
	}
}
