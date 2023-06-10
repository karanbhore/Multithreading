package com.prowings.synchronization;

public class Mythread extends Thread{

	Display d;
	String name;
	public Mythread() {
		super();
		
		
	}
	public Mythread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
