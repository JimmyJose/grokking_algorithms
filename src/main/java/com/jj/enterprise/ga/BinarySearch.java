package com.jj.enterprise.ga;

/**
 * Simple implementation of the binary search algorithm
 * 
 * @author JJ
 */
public class BinarySearch {
	
	private static final BinarySearch INSTANCE = new BinarySearch();
	
	/**
	 * Private constructor for enforcing singleton
	 */
	private BinarySearch() {}
	
	public static BinarySearch getInstance() {
		return INSTANCE;
	}
	
	public Integer search(Integer searchItem, Integer[] sortedArray) {
		
		if (searchItem == null) {
			throw new IllegalArgumentException("No item to search!");
		}
		
		if (sortedArray == null || sortedArray.length == 0) {
			throw new IllegalArgumentException("No list to search against!");
		}
		
		int low = 0;
		int high = sortedArray.length - 1;
		int mid = 0;
		Integer guess = null;
		
		while (low <= high) {
			mid = (low + high) / 2;
			guess = sortedArray[mid];
			
			if (guess == searchItem) {
				return mid;
			}
			
			if (guess < searchItem) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return null;
	}
}