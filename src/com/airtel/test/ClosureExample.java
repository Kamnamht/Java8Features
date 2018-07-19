package com.airtel.test;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// In java 7

		// doProcess(a, new Process() {
		//
		// @Override
		// public void process(int i) {
		// System.out.println(i+b);
		//
		// }
		// });

//		In java 8
		doProcess(a, (p1) -> System.out.println(a + b));
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}
