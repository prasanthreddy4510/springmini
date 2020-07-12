package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class OrderDetails {
	@Id
	@GeneratedValue
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="product")
	private Date orderPlacedDate;
	
	public OrderDetails() {
		
	}
	
	public OrderDetails(String id, String name, Date orderPlacedDate) {
		super();
		this.id = id;
		this.name = name;
		this.orderPlacedDate = orderPlacedDate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", name=" + name + ", orderPlacedDate=" + orderPlacedDate + "]";
	}
	
	

}
