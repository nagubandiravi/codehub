package com.ds.search;

public class BinarySearch {
	
	public int search (int[] source, int searchElement, int low, int high) {

		int mid = low + (high-low)/2;
		System.out.println("middle--"+mid);
		if (source[mid] == searchElement) {
			return mid;
		} else {
			if (source[mid] < searchElement) {
				return search(source, searchElement, mid+1, high);
			} else {
				return search(source, searchElement, low, mid-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 12};
		BinarySearch obj = new BinarySearch();
		int low = 0;
		int high = input.length;
		int index = obj.search(input, 9, low, high);
		System.out.println(input[index]+"----index:"+index);
	}

}
