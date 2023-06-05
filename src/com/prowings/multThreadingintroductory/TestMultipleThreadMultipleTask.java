package com.prowings.multThreadingintroductory;

class Thread1 extends Thread {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		m1();
	}

}

class Thread2 extends Thread {
	public void m2() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());

	}
}

public class TestMultipleThreadMultipleTask {

	public static void main(String[] args) {

		Thread t1 = new Thread1();
		Thread t2 = new Thread2();

		t1.setName("T1");
		t1.setName("T2");

		t2.start();
		t1.start();

	}
}
