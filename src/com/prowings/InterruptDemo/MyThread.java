package com.prowings.InterruptDemo;

public class MyThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("i am lazy thread!");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted !!");
		}
	}
}
