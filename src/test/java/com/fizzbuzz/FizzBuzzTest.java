package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzConvertorLeavesNormalNumbersAlone() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		Assert.assertEquals("1", fizzBuzzConverter.converter());
	}
}
