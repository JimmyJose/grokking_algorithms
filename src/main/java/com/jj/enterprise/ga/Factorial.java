package com.jj.enterprise.ga;

public class Factorial {
	
	private static final Factorial INSTANCE = new Factorial();
	/**
	 * Private constructor to enforce the singleton pattern
	 */
	private Factorial() {}
	
	public static Factorial getInstance() {
		return INSTANCE;
	}
	
	public int compute(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Negative numbers are not allowed!");
		}
		
		// The base case
		if (number == 0) {
			return 1;
		}
		
		// The recursive case
		return number * compute(number - 1);
	}
}
