package com.airtel.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise1Java8 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));
		// Java 8 way

		// Sort List by last name
		Collections.sort(person, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Create a method that prints all elements in the list
		printAll(person);
		// or
		printConditionally(person, p -> true, p->System.out.println(p));

		// Create a method that prints all people that have last name beginning with C
		printConditionally(person, (p) -> p.getLastName().startsWith("C"), p->System.out.println(p));

	}

	public static void printAll(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	public static void printConditionally(List<Person> personList, Predicate<Person> c, Consumer<Person> consumer) {
		for (Person person : personList) {
			if (c.test(person))
				// System.out.println(person);
				consumer.accept(person);
		}
	}

	// Use predicate instead of Condition interface. It is an alternative returning
	// boolean
	// Use Consumer which take input and have void return type
}
