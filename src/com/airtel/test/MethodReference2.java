package com.airtel.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));
		
		List<Person> person1 = Arrays.asList(new Person("Charles1", "Dickens", 60), new Person("Lewis1", "Carroll", 42),
				new Person("Thomas1", "Carlyle", 51), new Person("Charlotte1", "Brante", 45),
				new Person("Matthew1", "Arnold", 39));
		// Java 8 way

		printConditionally(person, p -> true,  System.out::println);//p->method

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
