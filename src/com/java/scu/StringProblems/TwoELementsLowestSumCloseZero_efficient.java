package com.java.scu.StringProblems;

import java.util.Arrays;

/**
 * Algorithm 
1) Sort all the elements of the input array.
2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
3) sum = a[l] + a[r]
4) If sum is -ve, then l++
5) If sum is +ve, then r–
6) Keep track of abs min sum.
7) Repeat steps 3, 4, 5 and 6 while l < r
 * @author ravichegondi
 *
 */
public class TwoELementsLowestSumCloseZero_efficient {

	public static void main(String[] args) {


		int[] arr = {1,60,-10,70,-80,85};
		getTwoElementsWithLowestSumCloseToZero_nLogn(arr);
	}

	private static void getTwoElementsWithLowestSumCloseToZero_nLogn(int[] arr) {
		
		Arrays.sort(arr);
		int i=0,j=arr.length-1,min_i=0,min_j=arr.length-1;
		int sum;
		int min_sum= 10000;
		while(i<j){
			sum = arr[i]+arr[j];
			if(Math.abs(sum)<Math.abs(min_sum)){
				min_sum = sum;
				min_i = i;
				min_j=j;
			}
			if(sum<0){
				i++;
			}else if(sum>0){
				j--;
			}
		}
		System.out.println("The elements are "+arr[min_i]+" "+arr[min_j]);
	}

}
