package com.prowings.InterruptDemo;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		MT t = new MT();
		t.start();
//		t.interrupt();

		System.out.println("end of main thread!!");
	}
}
