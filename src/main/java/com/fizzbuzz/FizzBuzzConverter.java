package com.fizzbuzz;

public class FizzBuzzConverter {

	public String converter(int toFizzBuzz) {
		if (toFizzBuzz % 3 == 0) {
			return "Fizz";
		} 
		return String.valueOf(toFizzBuzz);
	}
}
