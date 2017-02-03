package com.ds.string;

public class PatternMatch {
	
	public static void main(String[] args) {
		String input = "nagubandi";
		String pattern = "bandi";
		char[] inArr = new String(input).toCharArray();
		char[] patArr = new String(pattern).toCharArray();
		
		int n = inArr.length;
		int m = patArr.length;
		
		for (int a=0; a<n; a++) {
			boolean match = false;
			System.out.println("------------------------");
			int i=a, j=0;
			int k=i+m-1;
			if (!match) {
				while (k<n && j<m) {
					System.out.println("Pair:"+patArr[j]+" "+inArr[i]);
					if (inArr[i] == patArr[j]) {
						match = true;
					} else {
						match = false;
						break;
					}
					i++;
					j++;
				}
			}
			System.out.println("Match Found:"+match);
		}
	}
}
