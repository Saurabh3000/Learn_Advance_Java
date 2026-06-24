package com.basicMulti;

public class AnonymousThreadClassExample {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("First Thread");
			}
		};
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				System.out.println("Second Thread");
			}
		};
		Thread t2 = new Thread(r2);
		
		Runnable r3 = new Runnable() {
			public void run()
			{
				System.out.println("Three Thread");
			}
		};
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
