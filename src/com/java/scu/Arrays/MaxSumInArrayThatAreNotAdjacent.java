package com.java.scu.Arrays;

/**
 * Source :: https://www.youtube.com/watch?v=UtGtF6nc35g
 * incl: including this element what is the best max sum i can get
 * excl: excluding this element what is the best max sum i can get
 * 
 * new incl = Max(pastExcl+currentElement, past Incl); 
 * new Excl = past incl;
 * @author ravichegondi
 *
 */
public class MaxSumInArrayThatAreNotAdjacent {
	
	public int maxSum(int[] arr){
		if(arr.length == 0){
			return 0;
		}
		if(arr.length == 1){
			return arr[0];
		}
		if(arr.length ==2){
			return (arr[0]>=arr[1]?arr[0]:arr[1]);
		}
		
		int incl = arr[0];
		int excl = 0;
		
		for(int i = 1; i<arr.length;i++){
		int temp = incl;	
		  incl = (incl > excl+arr[i])?incl:excl+arr[i];
		  excl = temp;
		}
		return incl;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSumInArrayThatAreNotAdjacent msn = new MaxSumInArrayThatAreNotAdjacent();
		int arr[] = {4,1,1,4,2,1};
        System.out.println(msn.maxSum(arr));

	}

}
