package com.basicMulti;

public class JoinExample extends Thread {

	public void run()
	{
		System.out.println("Befor Sleeping");
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("After Sleeping");
	}
	public static void main(String[] args) throws InterruptedException {
		
		JoinExample t1 = new JoinExample();
		JoinExample t2 = new JoinExample();
		JoinExample t3 = new JoinExample();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		System.out.println("Over Execution");
	}
}
