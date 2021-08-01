package com.sourav.randomproblems;

public class LargestSumSubArray {
	
	private int[] elements;

	public static void main(String[] args) {
		int[] test = {1, -2, 3, 4, -5, 8};
		LargestSumSubArray largestSumSubArray = new LargestSumSubArray(test);
		System.out.println(largestSumSubArray.largestSum());

	}
	
	
	public LargestSumSubArray(int[] elements) {
		this.elements = elements;
	}


	public int largestSum() {
		
		int maxCurrent = elements[0];
		int maxGlobal = elements[0];
		
		for(int i = 1; i < elements.length; i++) {
			maxCurrent = Math.max(elements[i], maxCurrent + elements[i]);
			maxGlobal = maxCurrent > maxGlobal ? maxCurrent : maxGlobal;  
		}
		
		return maxGlobal;
	}

}
