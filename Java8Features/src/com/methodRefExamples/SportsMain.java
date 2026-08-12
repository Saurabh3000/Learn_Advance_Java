package com.methodRefExamples;

public class SportsMain {
	
	SportsMain(){
		//empty constructor because when we call instance 
		//method they need their empty constructor.
	}
	
	SportsMain(String s) //parameterized constructor
	{
		System.out.println("I always playing = "+s);
	}
	
	public static void display(String sp)
	{
		System.out.println("My Fav Sport is = "+sp);
	}
	
	public void info(String s)
	{
		System.out.println("I love playing = "+s);
	}
	public static void main(String[] args) 
	{
		//We call display method using lambda expression
		//	Sports s1 = (s) -> display(s);		
		//	s1.favSport("Badminton");
		
		//here we call display() using Static method referencing
		Sports s2 = SportsMain :: display;
		s2.favSport("Chess");
		
		//here we call info() using Instance method referencing
		SportsMain sm = new SportsMain();
		Sports s3 = sm :: info;
		s3.favSport("Chess");
		
		//here we call constructor referencing
		Sports s4 = SportsMain :: new;
		s4.favSport("Badminton for my Happiness");
	}
}
