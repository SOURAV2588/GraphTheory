package com.sourav.dp;

public class SubsetProblemRunner {

	public static void main(String[] args) {
		int[] numbers = {5,2,3,1};
		int sum = 9;
		SubsetSumProblem problem = new SubsetSumProblem(numbers, sum);
		problem.solve();
		problem.show();
	}

}
