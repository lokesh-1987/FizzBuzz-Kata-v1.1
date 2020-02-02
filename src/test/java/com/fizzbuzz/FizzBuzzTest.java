package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
	
	@Test
	public void fizzBuzzConvertorLeavesNormalNumbersAlone() {
		Assert.assertEquals("1", fizzBuzzConverter.converter(1));
		Assert.assertEquals("2", fizzBuzzConverter.converter(2));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfThree() {
		Assert.assertEquals("Fizz", fizzBuzzConverter.converter(3));
		Assert.assertEquals("Fizz", fizzBuzzConverter.converter(33));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfFive() {
		Assert.assertEquals("Buzz", fizzBuzzConverter.converter(5));
		Assert.assertEquals("Buzz", fizzBuzzConverter.converter(65));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfThreeAndFive() {
		Assert.assertEquals("FizzBuzz", fizzBuzzConverter.converter(60));
	}
	
	@Test 
	public void printTheHundredFizzBuzzes() { 
	  for(int i=1; i<=100; i++){ 
	    System.out.println(fizzBuzzConverter.converter(i)); 
	  } 
	}
	
	@Test 
	public void testForInvalidNumbers() {
		Assert.assertEquals("Please enter a valid no between 1 to 100.", fizzBuzzConverter.converter(-1));
	}
}