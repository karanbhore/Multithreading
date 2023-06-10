package com.prowings.SynchronizedBlocks;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display display = new Display();

		MyThreads t1 = new MyThreads(display, "dhoni");
		MyThreads t2 = new MyThreads(display, "Yuvi");

		t1.start();
		t2.start();

	}

}
