package com.sourav.dp;

import java.util.HashMap;

public class FibonacciNumbersDP {

	public static void main(String[] args) {
		System.out.println(fibonacciRecursion(8));
		
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		table.put(0, 1);
		table.put(1, 1);
		System.out.println(fibonacciMemoization(8,table));
		System.out.println(fibonacciTabulation(8,table));
	}
	
	public static int fibonacciRecursion(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	}
	
	/**
	 * Tabulation is top-down approach
	 * O(n) running time complexity
	 * 
	 * @param n
	 * @param table
	 * @return
	 */
	public static int fibonacciMemoization(int n, HashMap<Integer, Integer> table) {
		
		if(!table.containsKey(n)) {
			table.put(n, fibonacciMemoization(n-1, table)+fibonacciMemoization(n-2, table));
		}
		
		return table.get(n);
	}
	
	/**
	 * Tabulation is bottom-up approach
	 * O(n) running time complexity
	 * 
	 * @param n
	 * @param table
	 * @return
	 */
	public static int fibonacciTabulation(int n, HashMap<Integer, Integer> table) {
		
		for(int i=2; i<=n ; i++) {
			table.put(i, fibonacciMemoization(i - 1, table) + fibonacciMemoization(i - 2, table));
		}

		return table.get(n);
	}

}
