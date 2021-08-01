package com.sourav.mazesolver;

public class App {

	public static void main(String[] args) {
		int[][] maze = new int[][]{
			{1,1,1,1,1},
			{0,1,0,0,0},
			{0,0,0,1,0},
			{1,1,1,1,0},
			{1,0,0,0,0},
		};
		
		MazeSolver mazeSolver = new MazeSolver(maze, 1, 0);
		mazeSolver.findWay();
	}

}
