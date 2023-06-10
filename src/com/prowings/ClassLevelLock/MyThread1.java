package com.prowings.ClassLevelLock;

public class MyThread1 extends Thread {

	Display display;

	public MyThread1() {
		super();

	}

	public MyThread1(Display display) {
		super();
		this.display = display;
	}

	public void run() {
		display.displayc();
	}

}
