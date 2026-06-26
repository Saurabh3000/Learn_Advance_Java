package com.basicMulti;

public class SleepExample1  extends Thread{

	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		SleepExample1 t1 = new SleepExample1();
		
		t1.start();
	}
}
