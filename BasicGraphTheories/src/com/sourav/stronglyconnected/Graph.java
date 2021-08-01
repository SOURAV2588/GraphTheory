package com.sourav.stronglyconnected;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Graph() {
	}

	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	public Graph getTransposedGraph() {
		Graph transposedGraph = new Graph();
		List<Vertex> transposedVertexList = new ArrayList<Vertex>();
		
		this.vertexList.forEach(v -> transposedVertexList.add(v));
		
		for(Edge e : edgeList) {
			int endVertexIndex = transposedVertexList.indexOf(e.getEndVertex());
			transposedVertexList.get(endVertexIndex).addNeighbor(e.getStartVertex());
		}
		
		transposedGraph.setVertexList(transposedVertexList);
		return transposedGraph;
	}
}
