package com.airtel.test;

public class ThisReference {

	public static void main(String[] args) {
		ThisReference t = new ThisReference();

		// Cannot use this in static block
		// System.out.println(this);
		t.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("value of i is : " + i);
				System.out.println(this);

			}

			public String toString() {
				return "This is anonymous inner class";
			}
		});

		// even in lambda this will give error
		t.doProcess(10, i -> {
			System.out.println("value of i is : " + i);
			// It won't work
			// System.out.println(this);
		});
		
	
		//This will make this work
		t.execute();

	}

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	
	
	public void execute() {
		
//		This is using ref of t by which its being called
		doProcess(10, i -> {
			System.out.println("value of i is : " + i);
			
			 System.out.println(this);
		});
	}
}
