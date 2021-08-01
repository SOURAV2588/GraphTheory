package com.sourav.closestpair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithm {
	
	private List<Point> points;

	public Algorithm(List<Point> points) {
		this.points = points;
	}
	
	public double solveProblem() {
		List<Point> sortedXPoints = new ArrayList<Point>();
		List<Point> sortedYPoints = new ArrayList<Point>();
		
		for(Point p : points) {
			sortedXPoints.add(p);
			sortedYPoints.add(p);
		}
		
		Collections.sort(sortedXPoints, new XSorter());
		Collections.sort(sortedYPoints, new YSorter());
		
		return findClosestPoint(sortedXPoints, sortedYPoints, sortedXPoints.size());
	}

	private double findClosestPoint(List<Point> sortedXPoints, List<Point> sortedYPoints, int numberOfPoints) {
		if(numberOfPoints <= 3) {
			return bruteForceSearch(sortedXPoints);
		}
		
		int middleIndex = numberOfPoints/2;
		Point middlePoint = sortedXPoints.get(middleIndex);
		
		List<Point> leftSubPointSortedX = new ArrayList<Point>();
		List<Point> rightSubPointSortedX = new ArrayList<Point>();
		
		for(int index = 0; index < numberOfPoints ; index++) {
			if(sortedXPoints.get(index).getX() <= middlePoint.getX()) {
				leftSubPointSortedX.add(sortedXPoints.get(index));
			}else {
				rightSubPointSortedX.add(sortedXPoints.get(index));
			}
		}
		
		double deltaLeft = findClosestPoint(leftSubPointSortedX, sortedYPoints, middleIndex);
		double deltaright = findClosestPoint(rightSubPointSortedX, sortedYPoints, numberOfPoints - middleIndex);
		
		double delta = Math.min(deltaLeft, deltaright);
		
		List<Point> pointsInStrip = new ArrayList<Point>();
		for(int index = 0 ; index<numberOfPoints; index++) {
			if(Math.abs(sortedYPoints.get(index).getX() - middlePoint.getX()) < delta) {
				pointsInStrip.add(sortedYPoints.get(index));
			}
		}
		
		double minDistanceStrip = findMinimunDistanceInStrip(pointsInStrip, delta);
		
		return Math.min(delta, minDistanceStrip);
	}

	private double findMinimunDistanceInStrip(List<Point> pointsInStrip, double delta) {
		double minDistance = delta;
		
		for(int i = 0 ; i < pointsInStrip.size() ; i++) {
			for(int j = i + 1 ; j < pointsInStrip.size() 
					&& (Math.abs( points.get(j).getY() - points.get(i).getY()) < minDistance
							); j++) {
				minDistance = distance(points.get(i), points.get(j));
			}
		}
		return minDistance;
	}

	private double bruteForceSearch(List<Point> sortedXPoints) {
		// This has O(N2) running time
		double minDistance = Double.MAX_VALUE;
		for(int i = 0 ; i < sortedXPoints.size() ; i++) {
			for(int j = i + 1 ; j < sortedXPoints.size() ; j++) {
				double actualDistance = distance(points.get(i), points.get(j));
				if(actualDistance < minDistance) {
					minDistance = actualDistance;
				}
			}
		}
		return minDistance;
	}

	private double distance(Point point, Point point2) {
		double xDistance = Math.abs(point.getX() - point2.getX());
		double yDistance = Math.abs(point.getY() - point2.getY());
		double dis = Math.sqrt(xDistance*xDistance + yDistance*yDistance);
		return dis;
	}

}
