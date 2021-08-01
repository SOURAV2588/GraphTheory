package com.sourav.closestpair;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<Point> points = Arrays.asList(
				new Point(2,3),
				new Point(3,3),
				new Point(1,1),
				new Point(1,2),
				new Point(2,1),
				new Point(2,2));
		
		List<Point> pointsSecond = Arrays.asList(
				new Point(2.5,3),
				new Point(3,3),
				new Point(1,1),
				new Point(1,2),
				new Point(2,1),
				new Point(2,2));
		
		Algorithm algorithm1 = new Algorithm(points);
		Algorithm algorithm2= new Algorithm(pointsSecond);
		System.out.println(algorithm1.solveProblem());
		System.out.println(algorithm2.solveProblem());
	}

}
