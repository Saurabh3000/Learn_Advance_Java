package com.functionalExample;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(23,54,34,64,21,13,98);
		
		numbers.forEach(n->System.out.println(n));
		
		//numbers.forEach(System.out::println); This is very short hand notation of above line.
	}
}
