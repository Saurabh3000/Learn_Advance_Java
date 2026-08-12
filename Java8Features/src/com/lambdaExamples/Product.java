package com.lambdaExamples;

public class Product 
{
	private int id;
	private String name;
	private String tagLine;
	private int price;
	
	public Product() {
		//empty constructor
	}

	public Product(int id, String name, String tagLine, int price) {
		this.id = id;
		this.name = name;
		this.tagLine = tagLine;
		this.price = price;
	}

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

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", tagLine=" + tagLine + ", price=" + price + "]";
	}
	
}
