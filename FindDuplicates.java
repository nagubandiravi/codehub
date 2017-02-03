package com.sample;

import java.util.Scanner;

public class FindDuplicates {

	public int removeDuplicates(int[] nums) {
		int duplicateCount = 0;
        for (int i=0; i<nums.length; i++) {
        	int j = i+1;
            while (j < nums.length) {
            	if (nums[i] == nums[j]) {
            		duplicateCount++;
            		break;
                }
            	j++;
            }
        }
        return (nums.length-duplicateCount);
		
    }
	
	public static void main(String[] args) {
		FindDuplicates obj = new FindDuplicates();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] nums = new int[size];
		for (int i=0; i<size;i++) {
			nums[i] = input.nextInt();
		}
		
		int length = obj.removeDuplicates(nums);
		System.out.println(length);
	}
	
}
