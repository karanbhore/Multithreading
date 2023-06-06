package com.prowings.threadJoinDemo;

public class ThreadJoinDemo2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2.mt = Thread.currentThread();

		MyThread2 t = new MyThread2();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread!!");
		}

		Thread.sleep(1000);

	}
}
