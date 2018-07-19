package com.airtel;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter= new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		
		// 1st way LambdA
		Greeting m2=()->System.out.println("xyz");
		greeter.greet(m2);
		m2.perform();
		
		
		MyLambda m=()->System.out.println("dddddd");
		
		
	
		
		MyAdd add=(a,b)->a+b;
		
		greeter.greet(()-> System.out.println("hello worldnnnn"));
//		greeter.greet((int a)->  2);
		
		// Second way -> innerclass
		Greeting greetingInnerClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("yo");
				
			}
		};
		
		greetingInnerClass.perform();
	}
	
	interface MyLambda {
		void a();
	}
	interface MyAdd{
		int add(int x, int y);
	}
}
