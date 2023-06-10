package com.prowings.ClassLevelLock;

public class Display {

	public synchronized void displayn() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}

		}
		System.out.println();
		System.out.println();
	}

	public synchronized void displayc() {
		for (char i = 'a'; i < ('a' + 10); i++) {
			System.out.print(i+" ");

			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {

			}
		}
		System.out.println();
		System.out.println();
	}
	
}
