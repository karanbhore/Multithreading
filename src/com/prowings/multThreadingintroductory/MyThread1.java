package com.prowings.multThreadingintroductory;

public class MyThread1 extends Thread {

	public void run() {
		System.out.println("mythreading is running!!");

		System.out.println(Thread.currentThread().getName());

	}

}
