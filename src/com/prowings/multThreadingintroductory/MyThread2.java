package com.prowings.multThreadingintroductory;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("my thread 2 running!!");
		System.out.println(Thread.currentThread().getName());

	}

}
