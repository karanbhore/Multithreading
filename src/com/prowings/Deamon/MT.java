package com.prowings.Deamon;

public class MT extends Thread{

	public void run() {
		System.out.println("child thread started!!");
		for(int i=0;i<10;i++) {
			System.out.println("child thread!!");
			
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				
			}
			
		}
		System.out.println("child thread ended");
	}
	
	
}
