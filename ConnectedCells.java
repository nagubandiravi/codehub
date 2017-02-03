package com.sample;

import java.util.Scanner;

public class ConnectedCells {
	
	public static int count = 0;
	
	public void findCellsInRegion(Integer input[][], int n, int m) {
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (input[i][j] == 1) {

				} else {
					continue;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		Integer a[][] = new Integer[n][m];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = input.nextInt();
			}
		}
		
		ConnectedCells obj = new ConnectedCells();
		obj.findCellsInRegion(a, n, m);
		
	}
	
}
