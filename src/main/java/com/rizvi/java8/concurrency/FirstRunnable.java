package com.rizvi.java8.concurrency;

public class FirstRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Hello Mr. Rizvi");
		Thread t = new Thread(runnable);
		t.start();
	}
}
