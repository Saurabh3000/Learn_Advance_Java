package com.basicMulti;

public class SleepExample extends Thread{

	public void run()
	{
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
			try {
//				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		SleepExample t1 = new SleepExample();
		SleepExample t2 = new SleepExample();
		SleepExample t3 = new SleepExample();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
