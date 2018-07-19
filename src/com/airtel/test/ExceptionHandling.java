package com.airtel.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiConsumer;

public class ExceptionHandling {
	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 2;
		// one way
		// int key = 0;
		// process(someNumbers, key, (v, k) -> {
		// try {
		// System.out.println(v / k);
		// } catch (Exception e) {
		// System.out.println("An Arithmetic exception Happened");
		// }
		// });

		// other way
		ArrayList a = new ArrayList<>();
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
//		process(someNumbers, key, wrapperLambda((v, k) -> a.add(v / k)));
		System.out.println(a);
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		// overriding the behaviour of lambda
		// return (v,k)-> System.out.println(v + k);

		// Normal Scenario
		// return consumer;

		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}

		};
	}
}
