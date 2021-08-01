package com.sourav.prolems;

import java.util.ArrayList;
import java.util.List;

public class FindConnectedGraphs {
	
	 public static void main(String args[]) {
		 int[][] edges1 = new int[][] {
			 {0,1},
			 {1,2},
			 {2,3},
			 {3,4}
		 };
		 int[][] edges2 = new int[][] {
			 {0,1},
			 {1,2},
			 {3,4}
		 };
		 System.out.println( countComponents(5, edges1));
		 System.out.println( countComponents(5, edges2));
	 }
	
    public static int countComponents(int n, int[][] edges) {
        int numberOfGraphs = 0;
        List<List<Integer>> adjacencyList = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            adjacencyList.add(i,new ArrayList<Integer>());
        }
        
        for(int[] i : edges){
            adjacencyList.get(i[0]).add(i[1]);
            adjacencyList.get(i[1]).add(i[0]);
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                numberOfGraphs++;
                dfs(i,visited,adjacencyList);
            }
        }
        return numberOfGraphs;
    }
    
    private static void dfs(int i, boolean[] visited, List<List<Integer>> adjacencyList){
        List<Integer> list = adjacencyList.get(i);
        for(int j : list){
            if(!visited[j]){
            	visited[j] = true;
                dfs(j,visited,adjacencyList);
            }
        }
    }
}

