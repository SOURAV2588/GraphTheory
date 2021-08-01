package com.sourav.divideandconquer;

import java.util.Random;

public class MergeRunner {

	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = new int[30];
		
		for(int i = 0 ; i<nums.length ; i++) {
			nums[i] = random.nextInt(1000) - 500;
		}
		
		MergeSort mergeSort = new MergeSort(nums);
		mergeSort.sort(0, nums.length - 1);
		mergeSort.printResult();
		System.out.println();
		ReverseMergeSort reverseMergeSort = new ReverseMergeSort(nums);
		reverseMergeSort.sort(0, nums.length - 1);
		reverseMergeSort.printResult();
	}

}
