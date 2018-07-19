package com.airtel.test;

public class MethodReference {

	public static void main(String[] args) {
	//java 7	
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				printMessage();
				
			}
		});
		t.start();
		
//		Java 8
		Thread t1= new Thread(()->printMessage());
//		Method ref is equivalent to lambda expression
		Thread t2= new Thread(MethodReference::printMessage);
		
//		As printMessage is static method it will be callled with class name
	}
	
	public static void printMessage() {
		System.out.println("Helllo");
	}
	
}
