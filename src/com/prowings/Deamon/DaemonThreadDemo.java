package com.prowings.Deamon;

public class DaemonThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main thread started!!");
		MT t = new MT();
//		t.setDaemon(true);
		t.start();
		Thread.currentThread().sleep(11000);
		System.out.println("end of main thread!!");

	}
}
