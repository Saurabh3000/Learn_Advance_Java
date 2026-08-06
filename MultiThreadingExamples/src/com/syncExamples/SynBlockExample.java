package com.syncExamples;

public class SynBlockExample {
	
	String keys = "Lock and key";
	
	public void display()
	{
		System.out.println("Good Morning");
		System.out.println("Time for Breakfast");
		
			synchronized(keys)
				{
					System.out.println("Before");
					for(int i=1; i<=5; i++) {
						System.out.println(i);
			}
			System.out.println("After");
		}
	System.out.println("Time for Dinner");
	System.out.println("Good Night");
	}

	public static void main(String[] args) {
		
		SynBlockExample e1 = new SynBlockExample();
		
		Runnable r1 = new Runnable()
				{
					public void run()
					{
						e1.display();					
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
