package com.prowings.deadLocking;

public class DeadLock extends Thread{

	A a=new A();
	B b=new B();
	
	public void m1() {
		this.start();
		a.d1(b);
		
		
	}
	public void run() {
		b.d2(a);
	}
	public static void main(String[] args) {
		DeadLock deadLock=new DeadLock();
		
		deadLock.m1();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
