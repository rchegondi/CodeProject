package com.java.scu.StringProblems;

public class TwoElementsWithLowestSum_Brute {

	public static void main(String[] args) {

		int[] arr = {1,60,-10,70,-80,85};
		getTwoElementsWithLowestSumCloseToZero(arr);
		
	}

	private static void getTwoElementsWithLowestSumCloseToZero(int[] arr) {

		int min_i =0;
		int min_j =1;
		int sum=0;
		int min_sum = 10000; // Some Very Large Value
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				sum  = arr[i]+arr[j];
				if(Math.abs(min_sum)>Math.abs(sum)){
					min_sum = sum;
					min_i=i;
					min_j=j;
				}
			}
		}
		System.out.println(arr[min_i]+" "+arr[min_j]);
	}

}
