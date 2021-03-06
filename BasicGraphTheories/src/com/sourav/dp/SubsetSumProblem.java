package com.sourav.dp;

public class SubsetSumProblem {

	private boolean[][] dpTable;
	private int[] s;
	private int sum;

	public SubsetSumProblem(int[] s, int sum) {
		this.s = s;
		this.sum = sum;
		this.dpTable = new boolean[s.length + 1][sum + 1];
	}

	public void solve() {

		// initialize
		for (int i = 0; i < s.length; i++) {
			dpTable[i][0] = true;
		}

		for (int rowIndex = 1; rowIndex < s.length + 1; rowIndex++) {
			for (int colIndex = 1; colIndex < sum + 1; colIndex++) {

				if (colIndex < s[rowIndex - 1]) {
					dpTable[rowIndex][colIndex] = dpTable[rowIndex-1][colIndex];
				}else {
					if(dpTable[rowIndex-1][colIndex] == true) {
						dpTable[rowIndex][colIndex] = dpTable[rowIndex-1][colIndex];
					}else {
						dpTable[rowIndex][colIndex] = dpTable[rowIndex-1][colIndex - s[rowIndex-1]];
					}
				}
			}
		}
		System.out.println("Solution : " + dpTable[s.length][sum]);
	}
	
	public void show() {
		int colIndex = sum;
		int rowIndex = s.length;
		while(colIndex > 0 || rowIndex > 0) {
			if(dpTable[rowIndex][colIndex] == dpTable[rowIndex - 1][colIndex]) {
				rowIndex--;
			}else {
				System.out.println("We take : " + s[rowIndex-1]);
				colIndex = colIndex - s[rowIndex - 1];
			}
		}
	}

}
