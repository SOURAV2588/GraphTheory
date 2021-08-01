package com.sourav.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	Queue<Vertex> queue = new LinkedList<Vertex>();
	
	public void traverse(Vertex root) {
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Vertex actualVertex = queue.remove();
			System.out.println("Actual Visited vertex : " + actualVertex);
			
			actualVertex.getAdjacencyList().forEach(v->{
				if(!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			});
			
		}
	}
}
