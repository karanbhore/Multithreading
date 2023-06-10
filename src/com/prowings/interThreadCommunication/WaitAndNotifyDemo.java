package com.prowings.interThreadCommunication;

public class WaitAndNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("inside main method!!");
		ThreadB b=new ThreadB();
		b.start();
		
		synchronized (b) {
			System.out.println("main thread calling wait()");
			b.wait();
		}
		
		System.out.println("main thread got nitification!!");
		System.out.println(b.total);
		
		
		
		
		
		
		
		
	}
}
