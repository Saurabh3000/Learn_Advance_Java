package com.basicMulti;

public class SixthExample extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		SixthExample t1 = new SixthExample();
		t1.setName("First Thread");
		t1.setPriority(9);
		
		SixthExample t2 = new SixthExample();
		t2.setName("Second Thread");
		t2.setPriority(1);
		
		SixthExample t3 = new SixthExample();
		t3.setName("Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
