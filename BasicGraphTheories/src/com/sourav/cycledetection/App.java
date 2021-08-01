package com.sourav.cycledetection;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		
		f.addNeighbor(a);
		a.addNeighbor(e);
		a.addNeighbor(c);
		e.addNeighbor(f);
		c.addNeighbor(b);
		c.addNeighbor(d);
		
		List<Vertex> list = new ArrayList<Vertex>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		
		CycleDetector cycleDetector = new CycleDetector();
		cycleDetector.detectCycle(list);

	}

}
