package com.prowings.deadLocking;

public class B {

	public synchronized void d2(A a) {
		System.out.println("Thread 2 starts execution of d2()");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("thread 2 trying to calling A's last() ");
		a.last();

	}

	public synchronized void last() {
		System.out.println("inside B this is last method!!");
	}
}
