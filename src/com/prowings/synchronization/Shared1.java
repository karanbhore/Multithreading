package com.prowings.synchronization;

public class Shared1 {

	static void staticMethod() {
		synchronized(Shared1.class) {
//			static synchronized block
		}
	}
	void nonStaticMethod() {
		synchronized(this) {
//			non static synchronized block
		}
	}
	void anotherNonStaticMethod() {
		synchronized(this) {
//			non static synchronized block
		}
	}
	
}
