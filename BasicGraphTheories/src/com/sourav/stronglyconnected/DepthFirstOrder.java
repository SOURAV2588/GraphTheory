package com.sourav.stronglyconnected;

import java.util.Stack;

public class DepthFirstOrder {
	
	private Stack<Vertex> stack;

	public DepthFirstOrder(Graph graph) {
		this.stack = new Stack<Vertex>();
		
		for(Vertex vertex : graph.getVertexList()) {
			if(!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		
		for(Vertex v : vertex.getAdjacencyList()) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		
		stack.push(vertex);
	}
	
	public Stack<Vertex> getReversePost(){
		return this.stack;
	}
	
	

}
