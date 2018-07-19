package com.airtel;

public class RunnableClass {

	public static void main(String[] args) {

		// 1st
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");

			}
		});
		t.run();

		// 2nd

		Thread t1 = new Thread(() -> System.out.println("Inside Lambda runnable"));
		t1.start();
	}

}
