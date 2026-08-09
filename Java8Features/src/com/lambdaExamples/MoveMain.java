package com.lambdaExamples;

public class MoveMain { //implements Movies
	
	/*public void favMovie(String name)
	{
		System.out.println("Your Fav Movie is = "+name);
	} */

	public static void main(String[] args) {
		
		//Movies mov = new MoveMain();
		//mov.favMovie("Don 2");
		
		/* Anonymous way
		Movies mov1 = new Movies() {
			public void favMovie(String name)
			{
				System.out.println("Your Fav Movie is = "+name);
			}
		};		
		mov1.favMovie("3 Idiot"); */
		
		//here use lambda expression
		Movies mov2 = (n)->System.out.println("Your Fav Movie is = "+n);
		mov2.favMovie("Golmaal");
		
		Movies mov3 = (n)-> System.out.println("Your Fav Movie is = "+n);
		mov3.favMovie("Kantara");
	}
}
