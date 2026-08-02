package com.basicMulti;

public class DaemonExample extends Thread {

	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Daemon Thread");
		}else {
			System.out.println("User Thread");
		}
	}
	public static void main(String[] args) {
		
		DaemonExample t1 = new DaemonExample();
		DaemonExample t2 = new DaemonExample();
		DaemonExample t3 = new DaemonExample();
		
		t1.start();
		t2.start();
		t3.start();
		
		DaemonExample d1 = new DaemonExample();
		d1.setDaemon(true);
		d1.start();
	}
}
