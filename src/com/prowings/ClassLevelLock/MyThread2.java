package com.prowings.ClassLevelLock;

public class MyThread2 extends Thread {

	Display display;

	public MyThread2() {
		super();

	}

	public MyThread2(Display display) {
		super();
		this.display = display;
	}

	public void run() {
		display.displayn();
	}

}
