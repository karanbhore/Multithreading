package com.prowings.SynchronizedBlocks;

public class MyThreads extends Thread{

	Display d;
	String name;
	public MyThreads() {
		super();
		
	}
	public MyThreads(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}
