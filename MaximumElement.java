package com.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i=0; i<size; i++) {
            int type = in.nextInt();
            if (type == 1) {
                int value = in.nextInt();
                stack.push(value);
            } else if (type == 2) {
                stack.pop();
            } else if (type == 3){
            	int maximum = 0;
                for (int j=0; j<stack.size(); j++) {
                    int first = (int)stack.get(j);
                    int second = 0;
                    if ((j+1)<stack.size()) {
                    	second = (int)stack.get(j+1);
                    } else {
                    	second = (int)stack.get(j);
                    }
                    if (first > second) {
                        maximum = first;
                    } else {
                        maximum = second;
                    } 
                }
                System.out.println(maximum);
            }
        }
    }
	
}
