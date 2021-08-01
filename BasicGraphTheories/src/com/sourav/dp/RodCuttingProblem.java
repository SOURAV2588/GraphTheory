package com.sourav.dp;

public class RodCuttingProblem {
	
	private int rodLength;
	private int[][] dpTable;
	private int[] prices;
	
	public RodCuttingProblem(int rodLength, int[] prices) {
		this.rodLength = rodLength;
		this.prices = prices;
		this.dpTable = new int[prices.length][rodLength+1];
	}
	
	public void solve() {
		for (int i = 1; i < prices.length; i++) {
			for (int j = 1; j < rodLength+1; j++) {
				if(i<=j) {
					dpTable[i][j] = Math.max(dpTable[i-1][j], prices[i] + dpTable[i][j-i]);
				}else {
					dpTable[i][j] = dpTable[i-1][j];
				}
			}
		}
	}
	
	public void show() {
		System.out.println("Optimal Profit : $" + dpTable[prices.length-1][rodLength]);
		
		for(int n=prices.length-1, w=rodLength; n>0 ; ) {
			if(dpTable[n][w] != 0 && dpTable[n][w] != dpTable[n-1][w]) {
				System.out.println("We use piece : " + n + "m");
				w = w - n;
			}else {
				n--;
			}
		}
	}
	
	public void showDPTable() {
		for(int i = 0; i < dpTable.length; i++) {
			for(int j = 0; j <dpTable[i].length; j++){
				System.out.print(dpTable[i][j] + " ");
			}
			System.out.println();
		}
	}
		
}
