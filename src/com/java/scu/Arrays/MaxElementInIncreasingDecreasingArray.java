package com.java.scu.Arrays;

public class MaxElementInIncreasingDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		int max = getMaxElement(arr,0,arr.length-1);
		
		System.out.println(max);

	}

	private static int getMaxElement(int[] arr, int left, int right) {
		
	if(left == right){
		return arr[left];
	}
	if(right == left+1 && arr[left] >= arr[right]){
		return arr[left];
	}
	if(right == left+1 && arr[left]< arr[right]){
		return arr[right];
	}
	int mid = left + (right - left)/2;
	if(arr[mid] > arr[mid-1] && arr[mid]> arr[mid+1]){
		return arr[mid];
	}if(arr[mid] > arr[mid-1] && arr[mid]< arr[mid+1]){
		return getMaxElement(arr, mid+1, right);
	}else{
		return getMaxElement(arr, left, mid+1);
	}
	
	
			
	}
}
