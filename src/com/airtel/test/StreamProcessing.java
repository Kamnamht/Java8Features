package com.airtel.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamProcessing {

	// A sequence of elements supporting sequential and parallel aggregate
	// operations

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));

		person.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p.getFirstName()));

		// we are setting operation on stream. we havent started it for operation
		Stream<Person> stream = person.stream();
		long count = person.stream().filter(p -> p.getLastName().startsWith("C")).count();
		System.out.println(count);
		
		
//		parallel Stream  potentially split collection into multiple stream
		person.parallelStream().filter(p -> p.getLastName().startsWith("C")).count();
	}
}
