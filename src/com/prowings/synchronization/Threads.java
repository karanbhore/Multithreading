package com.prowings.synchronization;

public class Threads {

	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread t1 = new Thread(s1) ;
		Thread t2 = new Thread() ;
	
		t1.start();
		s2.start();

	}
}
