package com.jj.enterprise.ga;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/**
 * Quick sort algorithm
 * 
 * @author JJ
 */
public class QuickSort {
	
	private static final QuickSort INSTANCE = new QuickSort();
	/**
	 * Private constructor for enforcing singleton
	 */
	private QuickSort() {}

	public static QuickSort getInstance() {
		return INSTANCE;
	}

	public List<Integer> sort(List<Integer> list) {
		if (CollectionUtils.isEmpty(list) || list.size() == 1) {
			return list;
		}
		
		int pivotIndex = list.size() / 2;
		Integer pivot = list.remove(pivotIndex);
		List<Integer> less = new ArrayList<>();
		List<Integer> greater = new ArrayList<>();
		
		list.forEach(number -> {
			if (number > pivot) {
				greater.add(number);
			}
			else {
				less.add(number);
			}
		});
		
		List<Integer> sorted = sort(less);
		sorted.add(pivot);
		sorted.addAll(sort(greater));
		
		return sorted;
	}
}
