package com.prowings.Deamon;

public class MyThread extends Thread{

	
		public static void main(String[] args) {
			Thread.currentThread().setDaemon(true);
			System.out.println(Thread.currentThread().isDaemon());
			
			
			
			MyThread t=new MyThread();
			
			System.out.println(t.isDaemon());
			t.setDaemon(true);
			System.out.println(t.isDaemon());
			
			
			
			
			
			
			
		}
	
}
