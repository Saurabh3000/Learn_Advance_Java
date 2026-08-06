package com.syncExamples;

public class Shopping {
	
	String shoes = "Puma";
	String jacket = "addidas";
	
	public  void  Zudio()
	{
		synchronized(shoes) {
			System.out.println("Shoes from Zudio");
			synchronized(jacket) {
				System.out.println("Jacket from Zudio");
			}
		}
	}
	
	public  void Westside()
	{
		synchronized(jacket) {
			System.out.println("Jacket from Westside");
			synchronized(shoes) {
				System.out.println("Shoes from Westside");
			}
		}
	}
}
