package com.functionalExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {

	public static void main(String[] args) {

		//Supplier
		Supplier<String> sup = ()->{
			String s = "Java";
			s = s.concat("Funtional Interface");
			return s;
		};
		String result = sup.get();
		System.out.println(result);
		
		//Consumer
		Consumer<Integer> con = (n)->System.out.println("The num is = "+n);
		con.accept(12345);
		
		//Predicate
		Predicate<Integer> pre = (age)->{
			if(age>=18)
			{
				return true;
			}else {
				return false;
			}
		};
		boolean bool = pre.test(24);
		System.out.println(bool);
		
		//Function
		Function<Integer, String> fun = (n)->{
			if(n%2==0) {
				return "Even";
			}else {
				return "Odd";
			}
		};
		String r = fun.apply(32);
		System.out.println(r);
	}
}
