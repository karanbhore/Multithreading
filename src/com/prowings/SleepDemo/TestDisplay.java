package com.prowings.SleepDemo;

public class TestDisplay {

	public static void main(String[] args) {
		Display display1=new Display();
		Display display2=new Display();
		Display display3=new Display();
		
		DisplayThread t1=new DisplayThread(display1, "hello");
		DisplayThread t2=new DisplayThread(display2, "hello");
		DisplayThread t3=new DisplayThread(display3, "hello");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
		
		
		
		
	}
}
