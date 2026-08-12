package com.lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		Product pro1 = new Product(101,"Pare-G","G means Genius",10);
		
		Product pro2 = new Product();
		
		pro2.setId(102);
		pro2.setName("Maggie");
		pro2.setTagLine("2 Min only");
		pro2.setPrice(18);
		
		Product pro3 = new Product(103,"Kitkat","Cadbury",5);
		Product pro4 = new Product(104,"5 star","Cadbury",35);
		Product pro5 = new Product(105,"Park","Cadbury",12);
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(pro1);
		products.add(pro2);
		products.add(pro3);
		products.add(pro4);
		products.add(pro5);
		
		//sort ascending order using price
		Collections.sort(products,(p1,p2)->p1.getPrice()-p2.getPrice());
		
		//sort using name
		//Collections.sort(products,(p1,p2)->p1.getName().compareTo(p2.getName()));
		
		products.forEach(p->System.out.println(p));
	}
}
