package com.sourav.dfs;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
	
	Stack<Vertex> stack;
	
	public DepthFirstSearch() {
		this.stack = new Stack<Vertex>();
	}

	public void dfs(List<Vertex> vertexList) {
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}
	}

	private void dfsHelper(Vertex root) {
		stack.add(root);
		root.setVisited(true);
		
		while(!stack.isEmpty()) {
			Vertex vertex = stack.pop();
			System.out.println(vertex);
			
			vertex.getNeighbors().forEach(v -> {
				v.setVisited(true);
				stack.add(v);
			});
		}
	}

}
