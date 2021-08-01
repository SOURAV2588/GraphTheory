package com.sourav.recursion;

public class TowerOfHanoi {
	
	public static void main(String args[]) {
		TowerOfHanoi hanoi = new TowerOfHanoi();
		hanoi.solve(2, 'A', 'B', 'C');
	}
	
	public void solve(int disk, char source, char middle, char destination) {
		
		
		
		if(disk == 0) {
			System.out.println("Plate : " + disk + " from " + source + " to " + destination);
			return;
		}
		
		// we move n-1 plates to middle rod, to move the 
		// largest disk to the destination rod
		solve(disk-1,source, destination, middle);
		System.out.println("Plate : " + disk + " from " + source + " to " + destination);
		// we move n-1 plates to middle rod to destination
		solve(disk-1,middle, source, destination);
		
	}

}
