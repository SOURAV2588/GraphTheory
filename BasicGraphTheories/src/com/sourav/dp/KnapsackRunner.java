package com.sourav.dp;

public class KnapsackRunner {

	public static void main(String[] args) {
		int numOfItems = 3;
		int capacityOfKnapsack = 5;
		
//		int[] weightOfItems = new int[numOfItems + 1];
//		weightOfItems[1] = 4;
//		weightOfItems[2] = 2;
//		weightOfItems[3] = 3;
//		
//		int[] profitOfItems = new int[numOfItems + 1];
//		profitOfItems[1] = 10;
//		profitOfItems[2] = 4;
//		profitOfItems[3] = 7;
		
		int[] weightOfItems = new int[numOfItems];
		weightOfItems[0] = 4;
		weightOfItems[1] = 2;
		weightOfItems[2] = 3;
		
		int[] profitOfItems = new int[numOfItems];
		profitOfItems[0] = 10;
		profitOfItems[1] = 4;
		profitOfItems[2] = 7;
		
//		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weightOfItems, profitOfItems);
//		knapsack.solve();
//		knapsack.showResult();
		
		KnapsackRecursion recursion = new KnapsackRecursion();
		int solution = recursion.solve(capacityOfKnapsack, weightOfItems, profitOfItems, numOfItems);
		System.out.println(solution);
	}

}
