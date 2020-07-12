package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
public class BookEntity {
	@Id
	@GeneratedValue
	@Column(name="book_id")
	private Integer id;
	@Column(name="book_name")
	private String name;
	@Column(name="book_price")
	private String price;
	
	
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(Integer id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
