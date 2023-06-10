package com.prowings.SynchronizedBlocks;

public class Display {
	
	String name;
	

	public Display(String name) {
		super();
		this.name = name;
	}


	public Display() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void wish(String name) {
		System.out.println("before synchronization"+Thread.currentThread().getName());
		
		System.out.println();

		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.print("good morning!!  ");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}
				System.out.print(name);
				System.out.println(" "+Thread.currentThread().getName());

			}
			System.out.println("afetr synchronization"+Thread.currentThread().getName());
			System.out.println();
			
		}

	}

}
