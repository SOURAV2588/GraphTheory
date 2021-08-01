package com.sourav.dfs;

import java.util.List;

public class DepthFirstSearchRecursion {
	
	public void dfs(List<Vertex> vertexList) {
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}
	}

	private void dfsHelper(Vertex root) {
		System.out.println(root);
		
		root.getNeighbors().forEach(v -> {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		});
	}

}
