package com.prowings.synchronization;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display display = new Display();

		Mythread t1 = new Mythread(display, "Dhoni");
		Mythread t2 = new Mythread(display, "Yuvi");

		t1.start();
		t2.start();

	}
}
