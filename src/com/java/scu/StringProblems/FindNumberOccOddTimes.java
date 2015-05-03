package com.java.scu.StringProblems;


/**
 * Note: All the other numbers are appearing twice. Only one element occured odd number of times
 * 
 * @author ravichegondi
 *
 */
public class FindNumberOccOddTimes {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,1,2,3,4,3};
		findNumberOccuredOddNumberTimes(arr);
	}

	private static void findNumberOccuredOddNumberTimes(int[] arr) {
		
		int result = 0;
		for(int i=0;i<arr.length;i++){
			result = result ^ arr[i];
		}
		System.out.println(result);
		
	}

}
