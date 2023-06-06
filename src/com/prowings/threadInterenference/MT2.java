package com.prowings.threadInterenference;

public class MT2 extends Thread {

	Counter counter;

	public MT2(Counter counter) {
		super();
		this.counter = counter;

	}

	public void run() {
		System.out.println("Mt2 running decrement operation!!");

		System.out.println(Thread.currentThread().getName());

		counter.decrement();
		System.out.println("after decrementc :" + counter.value());
	}
}
