package com.java.scu.StringProblems;

public class SortedArrayRotatedFindElement_oneScan_logN {

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 8, 9, 10,11,12,13,14,16, 1, 2, 3};
		int num = 16;
		int n = arr.length-1;
		int position = search(arr,0,n,num);
		if(position!=-1)
			System.out.println("the position of element is "+position);
		else
			System.out.println("no element  found");
		
	}

	private static int search(int[] arr, int left, int right, int key) {
		if(left > right){
			return -1;
		}
		int mid = left+(right-left)/2;
		if(arr[mid]==key){
			return mid;
		}else{
			if(arr[left]<=arr[mid]){//left looks good
				if(arr[left]<=key && key <arr[mid]){
					return search(arr,left,mid-1,key);
				}else{
					return search(arr,mid+1,right,key);
				}
			}else {//right is ok
			    if(key > arr[mid] && key <= arr[right])	{
			    	return search(arr,mid+1,right,key);
			    }else{
			    	return search(arr,left,mid-1,key);
			    }
			}
		}
		
		
		
		//return left;
		
	}

}
