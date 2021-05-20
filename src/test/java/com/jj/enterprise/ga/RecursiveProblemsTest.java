package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Test class for {@link RecursiveProblems}
 * 
 * @author JJ
 */
public class RecursiveProblemsTest {

	@Test
	public void canary() {
		assertThat(RecursiveProblems.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenEmptyList_ThenSumIs0() {
		assertThat(RecursiveProblems.getInstance().sumOfList(Collections.emptyList()), is(0));
	}
	
	@Test
	public void givenValidList_ThenSumIsReturned() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		
		assertThat(RecursiveProblems.getInstance().sumOfList(list), is(12));
	}
	
	@Test
	public void givenEmptyList_ThenSizeIs0() {
		assertThat(RecursiveProblems.getInstance().numberOfItems(Collections.emptyList()), is(0));
	}
	
	@Test
	public void givenValidList_ThenSizeIsReturned() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		
		assertThat(RecursiveProblems.getInstance().numberOfItems(list), is(3));
	}
}
