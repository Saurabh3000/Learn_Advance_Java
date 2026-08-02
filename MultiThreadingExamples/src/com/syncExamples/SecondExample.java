package com.syncExamples;

public class SecondExample {

	public synchronized static void display() //share resource
	{
		System.out.println("Before");
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("After");
	}
	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			public void run() {
				display();
			}
		};
		Thread t1 = new Thread(r1,"First");
		Thread t2 = new Thread(r1,"Second");
		Thread t3 = new Thread(r1,"Third");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
//This example of Static synchronized method. 
//Method is static so no need to create object
