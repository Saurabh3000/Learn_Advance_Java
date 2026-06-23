package com.basicMulti;
import java.io.IOException;

public class ProcessExample {

	public static void main(String[] args) {
		try {
			Process p1 = new ProcessBuilder("Notepad.exe").start();	
			Process p2 = new ProcessBuilder("calc.exe").start();
			Process p3 = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE").start();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
