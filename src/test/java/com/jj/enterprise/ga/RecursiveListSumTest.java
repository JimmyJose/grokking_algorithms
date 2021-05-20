package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Test class for {@link RecursiveListSum}
 * 
 * @author JJ
 */
public class RecursiveListSumTest {

	@Test
	public void canary() {
		assertThat(RecursiveListSum.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenEmptyList_ThenReturns0() {
		assertThat(RecursiveListSum.getInstance().sum(Collections.emptyList()), is(0));
	}
	
	@Test
	public void givenValidList_ThenSumIsReturned() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		
		assertThat(RecursiveListSum.getInstance().sum(list), is(12));
	}
}
