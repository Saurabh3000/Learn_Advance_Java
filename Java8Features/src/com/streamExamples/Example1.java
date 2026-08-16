package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = 
				Arrays.asList(15,93,25,32,54,78,7,98,20,45);
		System.out.println(numbers);
		
		List<Integer> even = numbers.stream()
				.filter(n->n%2==0) //internally use Predicate
				.map(n->n+10) //internally use Functional
				.sorted()
				.collect(Collectors.toList());
		
		List<Integer> odd = numbers.stream()
				.filter(n->n%2==1)
				.map(n->n)
				.collect(Collectors.toList());
		
		System.out.println(even);
		System.out.println(odd);
	}
}
