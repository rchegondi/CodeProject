package com.java.scu.StringProblems;

import java.util.Set;
import java.util.TreeSet;

public class ThreeSortedArrays {
	
	private static void getSortedArray(int[] arr1,int[] arr2,int[] arr3){
		
		//int[] sortedArray = new int[arr1.length+arr2.length+arr3.length];
		
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<arr1.length;i++){
			set.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++){
			set.add(arr2[j]);
		}
		for(int k= 0;k<arr3.length;k++){
			set.add(arr3[k]);
		}
		
		System.out.println(set);
		
		
		
	}

	public static void main(String[] args) {

		int[] arr1 = {8, 10, 12};
		int[] arr2 = {4, 6, 9, 15};
		int[] arr3 = {11, 14, 18};
		
	ThreeSortedArrays.getSortedArray(arr1, arr2, arr3);
		//System.out.println("Sorted Array is :"+sortedArray);
		
	}

}
