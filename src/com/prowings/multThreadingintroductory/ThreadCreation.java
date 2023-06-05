package com.prowings.multThreadingintroductory;

public class ThreadCreation {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		t1.setName("MyThread1");

		MyThread2 t2 = new MyThread2();
		Thread myThread2 = new Thread(t2);
		myThread2.start();
		myThread2.setName("MyThread2");

		System.out.println(Thread.currentThread().getName());

	}
}
