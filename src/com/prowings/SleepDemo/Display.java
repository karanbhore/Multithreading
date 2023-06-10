package com.prowings.SleepDemo;

public class Display {

	public synchronized void print(String msg) {

		System.out.println(Thread.currentThread().getName() + "    before..");
		System.out.println(Thread.currentThread().getName() + "    before..");
		System.out.println(Thread.currentThread().getName() + "    before..");
		System.out.println(Thread.currentThread().getName() + "    before..");

		synchronized (this) {
			System.out.print("[" + msg);

//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}

			System.out.println("]");

			System.out.println();

		}
		System.out.println(Thread.currentThread().getName() + "   after..");
		System.out.println(Thread.currentThread().getName() + "   after..");
		System.out.println(Thread.currentThread().getName() + "   after..");
		System.out.println(Thread.currentThread().getName() + "   after..");

	}

}
