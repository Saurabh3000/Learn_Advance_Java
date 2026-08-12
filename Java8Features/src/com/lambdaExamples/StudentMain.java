package com.lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std1 = new Student(101,"Akshay",28,"Solapur");
		Student std2 = new Student(102,"Abhijeet",22,"Satara");
		Student std3 = new Student(103,"Pravin",19,"Vai");
		Student std4 = new Student(104,"Sonu",15,"Pune");
		Student std5 = new Student(105,"Abhi",34,"Sangali");
		
		List<Student> std = new ArrayList<Student>();
		
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);
		std.add(std5);

		Collections.sort(std,(s1,s2)->s1.getAge()-s2.getAge());
		
		std.forEach(s->System.out.println(s));
	}
}
