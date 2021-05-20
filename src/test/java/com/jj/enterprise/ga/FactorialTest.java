package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Factorial}
 * 
 * @author JJ
 */
public class FactorialTest {
	
	@Test
	public void canary() {
		assertThat(Factorial.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenNegativeInput_ThenExceptionThrown() {
		try {
			Factorial.getInstance().compute(-1);
			Assert.fail("Exception should have been thrown!");
		}
		catch (IllegalArgumentException iae) {}
	}
	
	@Test
	public void givenZero_ThenFactorialIs1() {
		assertThat(Factorial.getInstance().compute(0), is(1));
	}
	
	@Test
	public void givenPositiveNumber_ThenFactorialIsComputed() {
		assertThat(Factorial.getInstance().compute(5), is(120));
	}
}