package com.prowings.interThreadCommunication;

import java.util.Scanner;

public class PC {

	public void produce() throws InterruptedException {

		synchronized (this) {
			System.out.println("producer thread running");

			wait();

			System.out.println("resumed");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(1000);

		Scanner s = new Scanner(System.in);

		synchronized (this) {
			System.out.println("waiting for return key");
			System.out.println("print input");
			s.nextLine();

			System.out.println("return key pressed");

			notify();


		}
	}
}
