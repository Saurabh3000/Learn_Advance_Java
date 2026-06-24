package com.basicMulti;

public class CarThreadExample {

	public static void mahindra() {
		System.out.println("Mahindra Car");
	}
	
	public static void tata() {
		System.out.println("Tata Car");
	}
	
	public static void hundai() {
		System.out.println("Hundai Car");
	}
	
	public static void main(String[] args) {
	
		Runnable r1 = new Runnable() {
			public void run() {
				mahindra();
			}
		};
		Thread t1 = new Thread(r1);

		Runnable r2 = new Runnable() {
			public void run() {
				tata();
			}
		};
		Thread t2 = new Thread(r2);
		
		Runnable r3 = new Runnable() {
			public void run() {
				hundai();
			}
		};
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
