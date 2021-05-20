package com.jj.enterprise.ga;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class RecursiveProblems {
	
	private static final RecursiveProblems INSTANCE = new RecursiveProblems();
	private RecursiveProblems() {}
	
	public static final RecursiveProblems getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Method returns the sum of all the items in the list
	 */
	public int sumOfList(List<Integer> list) {
		if (CollectionUtils.isEmpty(list)) {
			return 0;
		}
		return list.remove(0) + sumOfList(list);
	}
	
	/**
	 * Method returns the count of the number of items in the list
	 */
	public int numberOfItems(List<Integer> list) {
		if (CollectionUtils.isEmpty(list)) {
			return 0;
		}
		list.remove(0);
		return 1 + numberOfItems(list);
	}
	
	/**
	 * Method returns the maximum value in the array
	 */
	public int maxItemInList(List<Integer> list) {
		if (CollectionUtils.isEmpty(list)) {
			throw new IllegalArgumentException("Invalid argument as the input list is required");
		}
		
		if (list.size() == 1) {
			return list.get(0);
		}
		
		int firstValue = list.remove(0);
		int sumSub = maxItemInList(list);
		return (firstValue > sumSub) ? firstValue : sumSub;
	}
}
