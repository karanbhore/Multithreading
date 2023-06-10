package com.prowings.deadLocking;

public class A {

	public synchronized void d1(B b) {
		System.out.println("thread 1 starts execution d1()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("Thread 1 caling B's last method");
		b.last();

	}
	public synchronized void last() {
		System.out.println("Inside A this is last method!!");
	}
}
