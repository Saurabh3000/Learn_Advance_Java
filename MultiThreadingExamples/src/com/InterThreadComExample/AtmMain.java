package com.InterThreadComExample;

public class AtmMain {

	public static void main(String[] args) {
		
		Atm user1 = new Atm();
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				for(int i=1; i<=5; i++)
				{
					user1.Withdraw(300);
				}
			}
		};
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				for(int i=1; i<=5; i++)
				{
					user1.Deposit(200);
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
