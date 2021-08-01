package com.sourav.randomproblems;

public class TwoEggs {
	
	private static final int NUMBER_OF_EGGS = 2;
	private static final int NUMBER_OF_FLOORS = 100;
	
	private int[][] dpTable = new int[NUMBER_OF_EGGS+1][NUMBER_OF_FLOORS+1];
	
	public static void main(String[] args) {
		TwoEggs eggs = new TwoEggs();
		System.out.println(eggs.solve());
	}

	
	public int solve() {
		
		dpTable[0][0]=1;
		dpTable[0][1]=1;
		
		for(int i=0; i<NUMBER_OF_FLOORS;i++) {
			dpTable[1][i] = i;
		}
		
		for(int n=2; n<=NUMBER_OF_EGGS;n++) {
			for(int m=2; m<=NUMBER_OF_FLOORS;m++) {
				dpTable[n][m] = Integer.MAX_VALUE;
				
				
				for(int x = 1; x<=m; x++) {
					int maxDrops = 1 + Math.max(dpTable[n-1][x-1], dpTable[n][m-x]);
					
					if(maxDrops < dpTable[n][m]) {
						dpTable[n][m] = maxDrops;
					}
				}
			}
		}
		
		return dpTable[NUMBER_OF_EGGS][NUMBER_OF_FLOORS];
		
	}
}
