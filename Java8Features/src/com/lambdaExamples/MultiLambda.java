package com.lambdaExamples;

public class MultiLambda {
	public static void main(String[] args) {
		//Old method
		Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("Hello Everyone");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//using Lambda expression
		Runnable r2 = () -> System.out.println("Hello All");
		Thread t2 = new Thread(r2);
		
		t2.start();
	}
}
