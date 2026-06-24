package com.basicMulti;

public class ThreadRunnableExample implements Runnable {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		Runnable r1 = new ThreadRunnableExample();
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new ThreadRunnableExample();
		Thread t2 = new Thread(r2);
		
		Runnable r3 = new ThreadRunnableExample();
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
