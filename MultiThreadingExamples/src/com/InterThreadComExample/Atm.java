package com.InterThreadComExample;

public class Atm {
	int balance = 1000;
	
	public synchronized void Withdraw(int amount) 
	{
		if(amount>balance) {
			System.out.println("Insufficient Balance, Kindly Deposit to Withdraw...!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Remaining Balance after Withdraw is = "+balance);
	}
	
	public synchronized void Deposit(int amount)
	{
		balance += amount;
		System.out.println("Balance after Deposit is = "+balance);
		notify();
	}
}
