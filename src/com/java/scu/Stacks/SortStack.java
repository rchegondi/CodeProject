package com.java.scu.Stacks;

import java.util.Stack;

public class SortStack {
	
	private Stack<Integer> sortStack(Stack<Integer> stk){
		Stack<Integer> rstk = new Stack<Integer>();
		
		while(!stk.empty()){
			int temp = stk.pop();
			while(!rstk.isEmpty() && rstk.peek()>temp){
			
				stk.push(rstk.pop());
				
			}
			rstk.push(temp);
		}
		
		return rstk;
	}

	public static void main(String[] args) {
		
		

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(8);
		stack.push(1);
		stack.push(9);
		stack.push(2);
		stack.push(7);
		System.out.println("Before: "+stack);
		SortStack sStack = new SortStack();
		System.out.println(sStack.sortStack(stack));
		
	}

}
