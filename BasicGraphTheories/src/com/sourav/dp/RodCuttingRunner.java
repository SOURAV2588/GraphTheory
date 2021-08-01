package com.sourav.dp;

public class RodCuttingRunner {

	public static void main(String[] args) {
		
		int n = 5;
		int[] prices = {0,2,5,7,3,9};
		
		RodCuttingProblem problem = new RodCuttingProblem(n, prices);
		problem.solve();
		problem.showDPTable();
		problem.show();
	}

}
