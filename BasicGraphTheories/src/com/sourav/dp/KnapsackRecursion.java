package com.sourav.dp;

public class KnapsackRecursion {
	
	public int solve(int m, int[] w, int[] v, int n) {
		
		if(m==0 || n==0) {
			return 0;
		}

		if(w[n-1] > m) {
			return solve(m,w,v,n-1);
		}else {
			int included = v[n-1] + solve(m-w[n-1], w , v, n - 1);
			int excluded = solve(m, w , v, n - 1);
			return Math.max(included, excluded);
		}
	}
}
