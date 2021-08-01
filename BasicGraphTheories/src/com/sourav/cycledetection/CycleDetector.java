package com.sourav.cycledetection;

import java.util.List;

public class CycleDetector {
	
	public void detectCycle(List<Vertex> list) {
		// there might be multiple independent clusters
		for(Vertex v :  list) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setBeingVisited(true);
		
		vertex.getNeighbors().forEach(v -> {
			if(v.isBeingVisited()) {
				System.out.println("Backward Edge");
				return;
			}
			
			if(!v.isBeingVisited()) {
				v.setBeingVisited(true);
				dfs(v);
			}
		});
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}

}
