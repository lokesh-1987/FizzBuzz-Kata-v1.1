package com.fizzbuzz;

public class FizzBuzzConverter {

	public String converter(int toFizzBuzz) {
		if (toFizzBuzz % 3 == 0) {
			return "Fizz";
		} else if(toFizzBuzz % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(toFizzBuzz);
	}
}
