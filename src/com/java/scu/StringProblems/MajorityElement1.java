package com.java.scu.StringProblems;

import java.util.Arrays;

public class MajorityElement1 {

	public static void main(String[] args) {

		int[] arr = {10,3,7,2,9,10,7,2,9,9,10,3,10,10,10,10,10,10,10};
		int majorityElement1= getMajorityElement1(arr);
		System.out.println(majorityElement1);
		
		
		int majorityElement2= getMajorityElement2(arr);
		System.out.println(majorityElement2);
		
		//Also Sort the array and find the median
	}

	
	// time:O(N) and space:O(1) 
	private static int getMajorityElement2(int[] arr) {

		int count=0,element =-1,n =arr.length;
		
		for(int i=0;i<n;i++){
			//if the counter =0 then set the current candidate to majority num
			if(count ==0){
				element = arr[i];
				count =1;
			}else if(element ==arr[i]){
				//increment count if not equals 0
				//element is same as current candidate
				count++;
			}else{
				count--;
			}
			
		}
		return element;
	}

	// O(NlogN)
	private static int getMajorityElement1(int[] arr) {
		if(arr.length == 1){
		  return arr[0];
		}
		Arrays.sort(arr);
		
		    int prev = arr[0];
			int count = 1;
			for(int i=1;i<arr.length;i++){
				if(arr[i]==prev){
					count++;
					if(count>arr.length/2)
						return arr[i];
				}else{
					prev = arr[i];
					count = 1;
				}
			}
			
			return 0;
		
	}

}
