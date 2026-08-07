package com.lambdaExamples;
@FunctionalInterface
public interface Movies 
{
	public void favMovie(String name);
	/*
	 * static and default method inside interface was 
	 * introduced in Java 8
	static void favActor(String name) 
	{
		System.out.println(name);
	}
	default void favSinger(String name)
	{
		System.out.println(name);
	}
	*/
}
