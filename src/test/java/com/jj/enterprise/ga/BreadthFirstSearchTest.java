package com.jj.enterprise.ga;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link BreadthFirstSearch}
 * 
 * @author JJ
 */
public class BreadthFirstSearchTest {
	
	@Test
	public void canary() {
		assertThat(BreadthFirstSearch.getInstance(), is(notNullValue()));
	}
	
	@Test
	public void givenNoUserGraphProvided_ThenExceptionThrown() {
		try {
			BreadthFirstSearch.getInstance().search(Collections.emptyMap());
			Assert.fail("Should have thrown an exception!");
		}
		catch (IllegalArgumentException iae) {
		}
	}
	
	@Test
	public void givenMangoSellerAmongFriendsThenItsTrue() {
		// Setup the test input(s) / condition(s)
		Map<String, List<String>> userGraphs = new HashMap<>();
		userGraphs.put("you", Arrays.asList(new String[]{"alice", "bob", "claire"}));
		userGraphs.put("alice", Arrays.asList(new String[]{"peggy"}));
		userGraphs.put("bob", Arrays.asList(new String[]{"anuj", "peggy"}));
		userGraphs.put("claire", Arrays.asList(new String[]{"jonny", "thom"}));
		userGraphs.put("peggy", Collections.emptyList());
		userGraphs.put("anuj", Collections.emptyList());
		userGraphs.put("jonny", Collections.emptyList());
		userGraphs.put("thom", Collections.emptyList());

		// Execute the code
		boolean found = BreadthFirstSearch.getInstance().search(userGraphs);
		
		// Verify the test result(s)
		assertThat(found, is(true));
	}
	
	@Test
	public void givenNoMangoSellerAmongFriendsThenItsFalse() {
		// Setup the test input(s) / condition(s)
		Map<String, List<String>> userGraphs = new HashMap<>();
		userGraphs.put("you", Arrays.asList(new String[]{"alice", "bob", "claire"}));
		userGraphs.put("alice", Arrays.asList(new String[]{"peggy"}));
		userGraphs.put("bob", Arrays.asList(new String[]{"anuj", "peggy"}));
		userGraphs.put("claire", Arrays.asList(new String[]{"jonny", "thon"}));
		userGraphs.put("peggy", Collections.emptyList());
		userGraphs.put("anuj", Collections.emptyList());
		userGraphs.put("jonny", Collections.emptyList());
		userGraphs.put("thon", Collections.emptyList());

		// Execute the code
		boolean found = BreadthFirstSearch.getInstance().search(userGraphs);
		
		// Verify the test result(s)
		assertThat(found, is(false));
	}
}