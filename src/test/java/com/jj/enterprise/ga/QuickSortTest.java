package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Test class for {@link QuickSort}
 * 
 * @author JJ
 */
public class QuickSortTest {
	
	@Test
	public void canary() {
		assertThat(QuickSort.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenAnEmptyArray_ThenItIsAlreadySorted() {
		assertThat(QuickSort.getInstance().sort(Collections.emptyList()), is(Collections.emptyList()));
	}
	
	@Test
	public void givenAnArrayWithSingleElement_ThenItIsAlreadySorted() {
		assertThat(QuickSort.getInstance().sort(Collections.singletonList(200)), is(Collections.singletonList(200)));
	}
	
	@Test
	public void givenAnArrayWithTwoElements_ThenItIsSorted() {
		// Setup the test input(s) / condition(s)
		List<Integer> unsorted = new ArrayList<>();
		unsorted.add(2);
		unsorted.add(1);
		
		// Execute the code
		List<Integer> sorted = QuickSort.getInstance().sort(unsorted);
			
		// Verify the test result(s)
		assertThat(sorted.get(0), is(1));
		assertThat(sorted.get(1), is(2));
	}
	
	@Test
	public void givenAnUnsortedList_ThenListIsSorted() {
		// Setup the test input(s) / condition(s)
		List<Integer> unsorted = new ArrayList<>();
		unsorted.add(2);
		unsorted.add(1);
		unsorted.add(3);
		unsorted.add(5);
		unsorted.add(4);
		
		// Execute the code
		List<Integer> sorted = QuickSort.getInstance().sort(unsorted);
		
		// Verify the test result(s)
		assertThat(sorted.get(0), is(1));
		assertThat(sorted.get(1), is(2));
		assertThat(sorted.get(2), is(3));
		assertThat(sorted.get(3), is(4));
		assertThat(sorted.get(4), is(5));
	}
}
