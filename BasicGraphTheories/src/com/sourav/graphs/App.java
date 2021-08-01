package com.sourav.graphs;

public class App {
	
	private static int[][] adjacencyMatrix = {
			{0,2,4,0},{0,0,0,3},{0,0,0,0},{0,0,0,0}
	};

	public static void main(String[] args) {
		for(int i=0; i<adjacencyMatrix.length; i++) {
			for(int j=0; j<adjacencyMatrix[i].length; j++) {
				if(adjacencyMatrix[i][j]!=0) {
					System.out.println("Edge with weights : "+adjacencyMatrix[i][j]);
				}
			}
		}
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		
		a.addNeighbor(b);
		a.addNeighbor(c);
		b.addNeighbor(d);
		
		a.showNeighbors();
		b.showNeighbors();
		c.showNeighbors();
		d.showNeighbors();
	}
	
}
