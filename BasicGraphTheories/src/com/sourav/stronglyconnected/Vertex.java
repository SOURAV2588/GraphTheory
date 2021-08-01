package com.sourav.stronglyconnected;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int id;
	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	private int componentId;
	
	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
		this.adjacencyList = new ArrayList<Vertex>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	
	public void addNeighbor(Vertex vertex) {
		this.adjacencyList.add(vertex);
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	

}
