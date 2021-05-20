package com.jj.enterprise.ga;

/**
 * Simple implementation of the selection sort algorithm
 * 
 * @author JJ
 */
public class SelectionSort {
	
	private static final SelectionSort INSTANCE = new SelectionSort();
	private SelectionSort() {}
	
	public static SelectionSort getInstance() {
		return INSTANCE;
	}
	
	public void sort(Integer[] items) {
		if (items == null || items.length == 0) {
			throw new IllegalArgumentException("Cannot sort null or empty array");
		}
		
		int numOfItems = items.length;
		for (int i = 0; i < numOfItems; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < numOfItems; j++) {
				if (items[j] < items[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = items[minIndex];
			items[minIndex] = items[i];
			items[i] = temp;
		}
	}
}
