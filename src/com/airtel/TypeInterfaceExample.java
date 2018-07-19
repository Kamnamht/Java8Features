package com.airtel;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		StringLengthLambda stringLengthLambda =(s)-> s.length();
		System.out.println(stringLengthLambda.getLength("ddddddd"));
		
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
