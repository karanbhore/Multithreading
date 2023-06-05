package com.prowings.multThreadingintroductory;

public class TestMultipleThreadsMultipleTask {

	public static void main(String[] args) {

		ThreadOne t1 = new ThreadOne("cut the ticket!!");
		ThreadOne t2 = new ThreadOne("Show the seat!!");

		t1.start();
		t2.start();

	}
}
