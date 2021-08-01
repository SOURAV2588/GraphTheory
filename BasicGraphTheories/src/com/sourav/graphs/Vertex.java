package com.sourav.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(String name) {
		this.name = name;
		adjacencyList = new ArrayList<Vertex>();
	}
	
	public void addNeighbor(Vertex vertx) {
		this.adjacencyList.add(vertx);
	}
	
	public void showNeighbors() {
		this.adjacencyList.forEach(v -> System.out.println(v));
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
