package com.streamExamples;

public class Product {

	private int id;
	private String name;
	private String tagline;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, String tagline, int price) {
		super();
		this.id = id;
		this.name = name;
		this.tagline = tagline;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", tagline=" + tagline + ", price=" + price + "]";
	}
	
	
}
