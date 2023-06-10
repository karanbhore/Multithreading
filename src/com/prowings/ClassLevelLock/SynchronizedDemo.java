package com.prowings.ClassLevelLock;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display display = new Display();

		MyThread1 t1 = new MyThread1(display);
		MyThread2 t2 = new MyThread2(display);

		t1.start();
		t2.start();

	}
}
