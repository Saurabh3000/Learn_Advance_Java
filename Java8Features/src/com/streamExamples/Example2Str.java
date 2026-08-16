package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2Str {

	public static void main(String[] args) {
		
		List<String> names = 
				Arrays.asList("Onkar", "Saurabh", "Abhijeet", "Mayur", "Aniket", "Suraj", "Om", "Prathamesh");
		
		System.out.println(names);
		
		List<String> naam = names.stream()
				.filter(n->n.startsWith("S"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(naam);
	}
}
