package com.sourav.mazesolver;

public class MazeSolver {
	
	int[][] maze;
	private boolean[][] visited;
	private int startRow;
	private int startCol;
 	
	public MazeSolver(int[][] maze, int startRow, int startCol) {
		this.maze = maze;
		this.visited = new boolean[maze.length][maze.length];
		this.startRow = startRow;
		this.startCol = startCol;
	}

	public void findWay() {
		System.out.println("Started");
		if(dfs(startRow,startCol)) {
			System.out.println("Solution exists");
		}else {
			System.out.println("No Solution exists");
		}
	}
	
	private boolean dfs(int x, int y) {
		if(x==maze.length-1 && y==maze.length-1) {
			System.out.println("Found it");
			return true;
		}
		if(isFeasible(x, y)) {
			visited[x][y]= true;
			//going down
			if(dfs(x+1,y)) {
				System.out.println("Going down to : "  + x + " ," + y);
				return true;
			}
			//going up
			if(dfs(x-1,y)) {
				System.out.println("Going up to : "  + x + " ," + y);
				return true;
			}
			//going right
			if(dfs(x,y+1)) {
				System.out.println("Going right to : "  + x + " ," + y);
				return true;
			}
			//going left
			if(dfs(x,y-1)) {
				System.out.println("Going left to : "  + x + " ," + y);
				return true;
			}
			visited[x][y] = false;
			return false;
		}
		return false;
	}

	private boolean isFeasible(int x, int y) {

		// vertical checking
		if (x < 0 || x > maze.length - 1) {
			return false;
		}
		// horizontal checking
		if (y < 0 || y > maze.length - 1) {
			return false;
		}
		
		if(visited[x][y]) {
			return false;
		}
		
		// wall checking
		if (maze[x][y] == 1) {
			return false;
		}
		System.out.println("Feasible at : " + x + " ," + y);
		return true;
	}

}
