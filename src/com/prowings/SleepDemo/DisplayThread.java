package com.prowings.SleepDemo;

public class DisplayThread extends Thread {

	Display display;

	String msg;

	public DisplayThread() {
		super();

	}

	public DisplayThread(Display display, String msg) {
		super();
		this.display = display;
		this.msg = msg;
	}

	public void run() {
		display.print(msg);
	}

}
