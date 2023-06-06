package com.prowings.threadYieldDemo;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MT t = new MT();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
