package com.prowings.synchronization;

public class SynchronizedBlock {

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);

		t1.setName("a1");
		t2.setName("a2");
		t3.setName("a3");

		t1.start();
		t2.start();
		t3.start();

	}
}
