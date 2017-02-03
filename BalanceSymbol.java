package com.sample;

import java.util.Stack;

public class BalanceSymbol {
	
	private char leftExpr = '(';
	private char rightExpr = ')';
	private Stack<Character> exprStack = new Stack<Character>();
	
	public void validateExpression(String expression) {
		char[] exprArray = expression.toCharArray();
		for (int i=0; i<exprArray.length; i++) {
			if (exprArray[i] == leftExpr) {
				exprStack.push(leftExpr);
			}
			if (exprArray[i] == rightExpr) {
				exprStack.pop();
			}
		}
		if (exprStack.isEmpty()) {
			System.out.println("Expression "+expression+" is valid");
		} else {
			System.out.println("Expression "+expression+" is invalid");
		}
	}
	
	public static void main(String[] args) {
		BalanceSymbol obj = new BalanceSymbol();
		obj.validateExpression("(a+b)");
		obj.validateExpression("((a+b)+c)");
		obj.validateExpression("(a+(b+c))");
		obj.validateExpression("((a+(b+c)))");
	}

}
