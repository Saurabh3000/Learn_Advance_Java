package com.basicMulti;

public class GarbageCollect {

	public void finalize()
	{
		System.out.println("Garbage is Collected");
		System.out.println(Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) {
		
		GarbageCollect g1 = new GarbageCollect();
		g1 = null;
		
		GarbageCollect g2 = new GarbageCollect();
		g2 = null;
		
		GarbageCollect g3 = new GarbageCollect();
		System.out.println(g3.hashCode());
		
		System.gc();
	}
}
