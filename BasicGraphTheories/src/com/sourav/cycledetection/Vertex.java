package com.sourav.cycledetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private boolean isBeingVisited;
	private List<Vertex> adjacentList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacentList = new ArrayList<Vertex>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return isBeingVisited;
	}

	public void setBeingVisited(boolean isBeingVisited) {
		this.isBeingVisited = isBeingVisited;
	}

	public List<Vertex> getNeighbors() {
		return adjacentList;
	}

	public void addNeighbor(Vertex vertex) {
		this.adjacentList.add(vertex);
	}

	@Override
	public String toString() {
		return name;
	}
	
}
