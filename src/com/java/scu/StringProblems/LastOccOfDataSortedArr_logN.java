package com.java.scu.StringProblems;

public class LastOccOfDataSortedArr_logN {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,10,10,11,12,13,13,14,14,14,14,15};
		int data = 14;
		int n = arr.length-1;
		int position = getLastOccuranceOfData_LogN(arr,data,0,n);
		if(position!=-1){
			System.out.println(position);
		}else{
			System.out.println("Number not found");
		}
		}

	private static int getLastOccuranceOfData_LogN(int[] arr, int data, int left,
			int right) {

		if(right >=left){
			int mid = left+(right-left)/2;
			if((arr[mid]==data && mid == right)||arr[mid]==data && arr[mid+1]>data){
				return mid;
			}else if(arr[mid]>data){
				return getLastOccuranceOfData_LogN(arr,data,left,mid-1);
			}else{
				return getLastOccuranceOfData_LogN(arr,data,mid+1,right);
			}
			
		}else{
			return -1;
		}
	}

}
