package com.syncExamples;

public class DeadlockExample {

	public static void main(String[] args) {
		
		Shopping s1 = new Shopping();
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				s1.Zudio();
			}
		};
		Thread t1 = new Thread(r1,"zudio");
		
		Runnable r2 = new Runnable() {
			public void run() {
				s1.Westside();
			}
		};
		Thread t2 = new Thread(r2,"westside");
		
		t1.start();
		/* to avoid or solve deadlock situation use join()
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
		t2.start();
	}
}
