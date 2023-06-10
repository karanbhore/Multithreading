package com.prowings.synchronization;

public class MHT2 extends Thread {

	Print p;

	public MHT2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MHT2(Print p) {
		super();
		this.p = p;
	}

	public void run() {
		System.out.println("MHT2 running!!");
		p.printMsg("hello");
	}
}
