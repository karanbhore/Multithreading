package com.prowings.synchronization;

public class Shared extends Thread {

	int i;

	synchronized void sharedMethod() {
		Thread t = Thread.currentThread();
		for (i = 0; i < 10; i++) {
			System.out.println(t.getName() + " : " + i);
		}

	}
	public void run() {
		sharedMethod();

	}

}
