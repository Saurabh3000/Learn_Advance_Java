package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
                new Product(1, "Laptop", "High performance laptop", 75000),
                new Product(2, "Mouse", "Wireless mouse", 800),
                new Product(3, "Keyboard", "Mechanical keyboard", 2500),
                new Product(4, "Monitor", "24 inch Full HD monitor", 12000),
                new Product(5, "Headphones", "Noise cancellation headphones", 5000),
                new Product(6, "Mobile", "Smartphone with 5G", 30000),
                new Product(7, "Tablet", "Android tablet", 18000),
                new Product(8, "Printer", "Wireless printer", 9000),
                new Product(9, "Webcam", "Full HD webcam", 1500),
                new Product(10, "Speaker", "Bluetooth speaker", 3000)
        );
		
		List<Product> result = products.stream()
                .filter(product -> product.getPrice() > 100)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

	}

}
