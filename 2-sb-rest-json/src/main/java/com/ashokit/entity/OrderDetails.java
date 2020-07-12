package com.ashokit.entity;

import java.util.Date;

public class OrderDetails {
	private Date orderDate;
	private String orderNumber;
	private double orderTotal;
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double d) {
		this.orderTotal = d;
	}
	

}
