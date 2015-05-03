package com.java.scu.StringProblems;

public class fistOccuranceOfNumberSortedArray_logN {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,10,10,11,12,13,13,14,14,14,14,15};
		int data = 14;
		int n = arr.length-1;
		int position = getFirstOccuranceOfData_LogN(arr,data,0,n);
		if(position!=-1){
			System.out.println(position);
			System.out.println(arr[position]);
		}else{
			System.out.println("Number not found");
		}
	}

	private static int getFirstOccuranceOfData_LogN(int[] arr, int data, int left,
			int right) 
	{
		if(right>=left){
			int mid = left +(right-left)/2;
			//This is the important step or Base Condition
			if((arr[mid]==data && mid == left) || ((arr[mid-1])<data && arr[mid]==data)){
			//if((arr[mid]==data && mid == left)){
				return mid;
			}else if(arr[mid]>=data){
				return getFirstOccuranceOfData_LogN(arr,data,left,mid-1);
			}else{
				return getFirstOccuranceOfData_LogN(arr,data,mid+1,right);
			}
			
		}else{
			return -1;
		}
		
		
	}

}
