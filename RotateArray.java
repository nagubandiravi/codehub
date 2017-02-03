package com.sample;

import java.util.HashMap;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int num[] = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>(); 
		
		for (int i=0; i<num.length; i++) {
			if ((i+k) < num.length) {
				indexMap.put(i, (i+k));
			} else {
				indexMap.put(i, (i-k)-1);
			}
		}
		
		int output[] = new int[num.length];
		
		for (int i=0; i<num.length; i++) {
			output[i] = num[indexMap.get(i)];
		}
		
		for (int i=0; i<output.length; i++) {
			System.out.print(output[i]+" ");
		}
	}

}
