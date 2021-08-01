package com.sourav.dp;

public class Knapsack {
	
	private int numOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int totalprofits;
	private int[] weigths;
	private int[] values;
	
	public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weigths, int[] values) {
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weigths = weigths;
		this.values = values;
		this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
	}
	
	public void solve() {
		for(int i = 1;i<numOfItems + 1; i++) {
			for(int w = 1;w<capacityOfKnapsack + 1; w++) {
				int notTakingItem = knapsackTable[i-1][w];
				int takingItem = 0;
				
				if(weigths[i] <= w) {
					takingItem = values[i] + knapsackTable[i-1][w-weigths[i]];
				}
				
				knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
			}
		}
		
		totalprofits = knapsackTable[numOfItems][capacityOfKnapsack];
	}
	
	public void showResult() {
		System.out.println("Total Benifit : " + totalprofits);
		
		for(int n=numOfItems, w=capacityOfKnapsack; n>0 ; n--) {
			if(knapsackTable[n][w]!=0 && knapsackTable[n][w]!=knapsackTable[n-1][w]) {
				System.out.println("We take item : #"+n);
				w = w - weigths[n];
			}
		}
	}

}
