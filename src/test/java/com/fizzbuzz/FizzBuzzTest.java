package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzConvertorLeavesNormalNumbersAlone() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		Assert.assertEquals("1", fizzBuzzConverter.converter(1));
		Assert.assertEquals("2", fizzBuzzConverter.converter(2));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfThree() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		Assert.assertEquals("Fizz", fizzBuzzConverter.converter(3));
		Assert.assertEquals("Fizz", fizzBuzzConverter.converter(33));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfFive() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		Assert.assertEquals("Buzz", fizzBuzzConverter.converter(5));
		Assert.assertEquals("Buzz", fizzBuzzConverter.converter(65));
	}
	
	@Test
	public void fizzBuzzConvertorLeavesMultipleOfThreeAndFive() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		Assert.assertEquals("FizzBuzz", fizzBuzzConverter.converter(60));
	}
	
	@Test 
	public void printTheHundredFizzBuzzes() { 
	  FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter(); 
	  for(int i=1; i<=100; i++){ 
	    System.out.println(fizzBuzzConverter.converter(i)); 
	  } 
	}
}