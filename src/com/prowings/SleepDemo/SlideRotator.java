package com.prowings.SleepDemo;

public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println("slide -"+i);
			Thread.sleep(2000);
		}
	}
}
