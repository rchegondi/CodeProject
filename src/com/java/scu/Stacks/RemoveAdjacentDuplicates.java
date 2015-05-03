package com.java.scu.Stacks;

import java.util.Stack;

/**
 * input array: {1,5,6,8,8,8,0,1,1,0,6,5}
 * output : 1
 * input: 1,9,6,8,8,8,0,1,1,0,6,5
 * output: 1,9,5
 * @author ravichegondi
 *
 */
public class RemoveAdjacentDuplicates {
	
	public static void removeAdjacentDuplicates(int[] arr){
		
		int[] stkArray = new int[arr.length];
		int stkPtr = -1;
		for(int i=0;i<arr.length;i++){
			
			if(stkPtr==-1||stkArray[stkPtr]!=arr[i]){
				stkPtr++;
				stkArray[stkPtr] = arr[i];
			}else{
				while(i<arr.length && stkArray[stkPtr]==arr[i]){
					
					i++;
				}
				stkPtr--; // move the stack pointer to 1 position down and a new element goes to stkpointer ++
			}
		}
		
		for(int j=0;j<=stkPtr;j++){
			System.out.print(stkArray[j]+" ");
		}
		System.out.println();
		
		
	}
	

	public static void main(String[] args) {
		
		int[] arr1 = {1,9,6,8,8,8,0,1,1,0,6,5};
		RemoveAdjacentDuplicates.removeAdjacentDuplicates(arr1);
		
        //int[] arr2 = {1,9,6,8,8,8,0,1,1,0,6,5};
		//RemoveAdjacentDuplicates.removeAdjacentDuplicates(arr2);

	}

}
