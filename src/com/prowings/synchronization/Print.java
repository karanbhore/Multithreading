package com.prowings.synchronization;

public class Print {

	public void printMsg(String msg) {

		System.out.println("before aaaaa " + Thread.currentThread().getName());
		System.out.println("before aaaaa " + Thread.currentThread().getName());
		System.out.println("before aaaaa " + Thread.currentThread().getName());
		System.out.println("before aaaaa " + Thread.currentThread().getName());
		System.out.println("before aaaaa " + Thread.currentThread().getName());

		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}

	}

	}
