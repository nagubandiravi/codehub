package com.ds.stack;

import java.util.Stack;

public class CheckExpression {

	public boolean validateExpression(String expression) {
		if (null == expression || expression.isEmpty()) {
			System.out.println("Invalid Expression");
		} else {
			Stack<Character> stack = new Stack<Character>();
			for (char ch:expression.toCharArray()) {
				if (ch == ')') {
					char top = stack.peek();
					stack.pop();
					
					if (top == '(') {
						return true;
					} else {
						while (top != '(') {
							top = stack.peek();
							stack.pop();
						}
					}
				} else {
					stack.push(ch);
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		CheckExpression obj = new CheckExpression();
		boolean duplicatesFound = obj.validateExpression("(a+b)");
		System.out.println(duplicatesFound);
		duplicatesFound = obj.validateExpression("((a+b))");
		System.out.println(duplicatesFound);
		
	}
}
