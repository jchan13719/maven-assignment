package com.assignment.my_assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphaNumericTest {
	@Test
	public void checkLowercase() {
		AlphaNumeric lowercase = new AlphaNumeric();
		assertEquals(true, lowercase.lowercase("joirenreg"));
		assertEquals(false, lowercase.lowercase("joirEnreg"));
		assertEquals(false, lowercase.lowercase("joirngjdg1,"));
	}

	@Test
	public void checkUppercase() {
		AlphaNumeric lowercase = new AlphaNumeric();
		assertEquals(true, lowercase.uppercase("JBC"));
		assertEquals(false, lowercase.uppercase("joirEnreg"));
		assertEquals(false, lowercase.uppercase("JB2C1"));
	}

	@Test
	public void checkNumeric() {
		AlphaNumeric lowercase = new AlphaNumeric();
		assertEquals(true, lowercase.numeric("1231235145657890"));
		assertEquals(false, lowercase.numeric("joirEnreg"));
		assertEquals(false, lowercase.numeric("JB2C1"));
		assertEquals(false, lowercase.numeric("1231235145657890~"));
	}
}
