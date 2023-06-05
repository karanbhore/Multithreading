package com.prowings.synchronization;

public class A implements Runnable {
	int token = 1;

	@Override
	public void run() {
		synchronized (this) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(token + "allocated to " + name);
			token++;

		}

	}

}
