package com.prowings.threadInterenference;

public class MT1 extends Thread {

	Counter counter;

	public MT1(Counter counter) {
		super();
		this.counter = counter;

	}

	public void run() {
		System.out.println("Mt1 running increment operation!!");

		System.out.println(Thread.currentThread().getName());

		counter.increment();
		System.out.println("after increment c :" + counter.value());
	}
}
