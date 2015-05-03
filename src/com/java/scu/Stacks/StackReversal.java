package com.java.scu.Stacks;

import java.util.Stack;

public class StackReversal {
	public  void stackReversal(Stack<Integer> stack){
		if(stack.isEmpty())
			 return;
		int temp  = stack.pop();
		stackReversal(stack);
		insertAtBottom(stack,temp);
		
		
	}

	private void insertAtBottom(Stack<Integer> stack, int data) {
		if(stack.isEmpty()){
			stack.push(data);
		}else{
			int temp1 = stack.pop();
			insertAtBottom(stack,data);
			stack.push(temp1);
		}
		
	}

	public static void main(String[] args) {
    
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Before: "+stack);
		StackReversal stkRev = new StackReversal();
		stkRev.stackReversal(stack);
		
		System.out.println("After: "+stack);
	}

}
