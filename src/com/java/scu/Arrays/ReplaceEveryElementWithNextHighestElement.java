
package com.java.scu.Arrays;

import java.util.Stack;

public class ReplaceEveryElementWithNextHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,6,9,4,3,1};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Stack<Integer> maxStack = new Stack<Integer>();
		for(int i = arr.length-1;i>0;i--){
			if(!maxStack.isEmpty()){
				if(arr[i] >= maxStack.peek()){
					maxStack.push(arr[i]);
				}
			}else{
				maxStack.push(arr[i]);
			}
		}
	    StringBuilder sb = new StringBuilder();	
	    
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] == maxStack.peek() ){
				maxStack.pop();
				sb.append(maxStack.peek());
			}else{
				sb.append(maxStack.peek());
			}
			sb.append(' ');
		}
		sb.append(arr[arr.length-1]);
		
		
        System.out.println(sb.toString());
	}

}
