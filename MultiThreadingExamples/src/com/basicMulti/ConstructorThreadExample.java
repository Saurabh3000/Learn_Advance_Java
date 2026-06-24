package com.basicMulti;

public class ConstructorThreadExample implements Runnable {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		t1.setName("First Thread");
		
		Thread t2 = new Thread("Second Thread");
		
		Runnable r1 = new ConstructorThreadExample();
		Thread t3 = new Thread(r1);
		t3.setName("Third Thread");
		
		Thread t4 = new Thread(r1,"Four Thread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

