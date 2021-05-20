package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for the {@link BinarySearch} class
 * 
 * @author JJ
 */
public class BinarySearchTest {

	@Test
	public void canary() {
		assertThat(BinarySearch.getInstance(), notNullValue());
	}

	@Test
	public void givenNoSearchItemProvided_Then_IllegalArgumentExceptionIsThrown() {
		// Setup the test input(s) / condition(s)
		Integer[] sorted = { 1, 5, 12, 99 };
		
		// Execute the code
		try {
			BinarySearch.getInstance().search(null, sorted);
			Assert.fail("Should have thrown an exception!");
		}
		catch (IllegalArgumentException iae) {
			assertThat(iae.getMessage(), is("No item to search!"));
		}
	}
	
	@Test
	public void givenNoArrayIsProvided_Then_IllegalArgumentExceptionIsThrown() {
		// Setup the test input(s) / condition(s)
		Integer[] sorted = null;
		
		// Execute the code
		try {
			BinarySearch.getInstance().search(10, sorted);
			Assert.fail("Should have thrown an exception!");
		}
		catch (IllegalArgumentException iae) {
			assertThat(iae.getMessage(), is("No list to search against!"));
		}
	}
	
	@Test
	public void givenEmptyArrayIsProvided_Then_IllegalArgumentExceptionIsThrown() {
		// Setup the test input(s) / condition(s)
		Integer[] sorted = {};
		
		// Execute the code
		try {
			BinarySearch.getInstance().search(10, sorted);
			Assert.fail("Should have thrown an exception!");
		}
		catch (IllegalArgumentException iae) {
			assertThat(iae.getMessage(), is("No list to search against!"));
		}
	}

	@Test
	public void givenItemNotFound_Then_NullValueIsReturned() {
		// Setup the test input(s) / condition(s)
		Integer[] sorted = { 1, 3, 5, 7, 9 };

		// Execute the code
		Integer result = BinarySearch.getInstance().search(-1, sorted);

		// Verify the test result(s)
		assertThat(result, is(nullValue()));
	}
	
	@Test
	public void givenItemIsFound_Then_ItemsIndexInArrayIsReturned() {
		// Setup the test input(s) / condition(s)
		Integer[] sorted = { 1, 3, 5, 7, 9 };

		// Execute the code
		Integer result = BinarySearch.getInstance().search(3, sorted);

		// Verify the test result(s)
		assertThat(result, is(1));
	}
}