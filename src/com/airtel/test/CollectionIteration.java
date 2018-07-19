package com.airtel.test;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));

		// both are External Iterators

		// using for loop
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}

		// Using for each loop
		for (Person p : person) {
			System.out.println(p);
		}

		// Internal Iterator
		
		person.forEach(p->System.out.println(p));
		
		
		person.forEach(System.out::println);

	}
}
