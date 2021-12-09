package com.example.entity;

public class Product {

	private String id;
	private String name;
	private int price;
	
	public Product () {
		
	}
	
	public Product (String id , String name , int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	public String getId () {
		return this.id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}

	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice () {
		return this.price;
	}

}
