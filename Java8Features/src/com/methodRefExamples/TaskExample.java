package com.methodRefExamples;

public class TaskExample {

	public static void display()
	{
		System.out.println("Java is programming language");
	}
	public static void info()
	{
		System.out.println("Write Once Run Anywhere");
	}
	public static void dakhawa()
	{
		System.out.println("Java is Object-oriented");
	}
	public static void main(String[] args) {
		
		Runnable r1 = TaskExample::display;
		Thread t1 = new Thread(r1);
		
		Runnable r2 = TaskExample::info;
		Thread t2 = new Thread(r2);
		
		Runnable r3 = TaskExample::dakhawa;
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
