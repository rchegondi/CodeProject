package com.java.scu.Stacks;

//import java.util.Stack;

public class MinMaxStackTest {

	public static void main(String[] args) {
		MinMaxStack minMax = new MinMaxStack();
		//System.out.println(minMax.getMax());
		//System.out.println(minMax.getMin());
		
		int[] arr = {18,19,29,15,16};
		
		for(int i=0;i<arr.length;i++){
			minMax.push(arr[i]);
		}
		
		//System.out.println(minMax.peek());
		System.out.println("1st Min "+minMax.getMin());
		System.out.println("1st Max "+minMax.getMax());
		
		minMax.pop();
		minMax.pop();
		System.out.println("After POP 1st Min "+minMax.getMin());
		System.out.println("After POP 1st Max "+minMax.getMax());
		
		
	}

}
