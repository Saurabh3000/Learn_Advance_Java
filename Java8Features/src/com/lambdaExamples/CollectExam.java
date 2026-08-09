package com.lambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class CollectExam {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Java");
		names.add("Python");
		names.add("C++");
		names.add("C");
		names.add("PHP");
		
	/*	for(String c : names){
			System.out.println(c);
		} */
		
		names.forEach(c->System.out.println(c));
	}
}
