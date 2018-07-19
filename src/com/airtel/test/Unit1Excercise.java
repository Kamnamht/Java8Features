package com.airtel.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Brante", 45),
				new Person("Matthew", "Arnold", 39));
		// Java 7 way

		// Sort List by last name
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Create a method that prints all elements in the list
		printAll(person);

		// Create a method that prints all people that have last name begining with C
		printConditionally(person, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
				
			}
			
		
		});
		
		printConditionally(person, (p)->p.getLastName().startsWith("C"));
		
		
	}

	public static void printAll(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
	 
	public static void printConditionally(List<Person> personList , Condition c) {
		for (Person person : personList) {
			if(c.test(person))
			System.out.println(person);
		}
	}
	
}

interface Condition{
	boolean test(Person p);
}
