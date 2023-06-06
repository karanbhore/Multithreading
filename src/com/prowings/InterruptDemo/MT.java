package com.prowings.InterruptDemo;

public class MT extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i am lazy thread!");

		}
		System.out.println("i am entering into sleeping state!!");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("i got interrupted !!");
		}
	}
}
