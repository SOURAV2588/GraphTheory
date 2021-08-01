package com.sourav.divideandconquer;

public class MergeSort {
	
	private int[] nums;
	private int[] tempArray;
	
	public MergeSort(int[] nums) {
		this.nums = nums;
		this.tempArray = new int[nums.length];
	}

	public void sort(int first, int last) {
		
		if(first >= last) {
			return;
		}
		
		int middle = (last + first)/2;
		
		sort(first, middle);
		sort(middle + 1, last);
		merge(first,middle,last);
	}
	
	public void merge(int first, int middle, int last) {
		
		for(int i = first; i<=last ; i++) {
			tempArray[i] = nums[i];
		}
		
		int counter = first;
		int i = first;
		int j = middle + 1;
		
		while (i <= middle && j <= last) {
			if (tempArray[i] < tempArray[j]) {
				nums[counter++] = tempArray[i++];
			} else {
				nums[counter++] = tempArray[j++];
			}
		}
		
		while(i<=middle) {
			nums[counter++] = tempArray[i++];
		}
		
		while(j<=last) {
			nums[counter++] = tempArray[j++];
		}
	}
	
	public void printResult() {
		for(int a : nums) {
			System.out.print(a + " ");
		}
	}

}
