package com.java.scu.Searching;

/**
 * This is similar to Red White Blue problem:	
 * http://techieme.in/dutch-flag-problem/
 * here red:0 white:1 blue:2
 * @author ravichegondi
 *
 */
public class Seperate012inArray {

	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,2,1,2,0,0,0,1};
	    sortNumbers(arr);
		
		/*
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+" ");
		}
		System.out.println();
*/
	}

	private static void sortNumbers(int[] arr) {
		//zp: zerPointer;op:onePointer;tp:tPointer
		int low=0,mid=0,high=arr.length-1;
		int temp;
		while(mid<=high){
			if(arr[mid]==0){
				//swap(arr[mid],arr[low]
				temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				
				mid++;
				low++;
				
				
			}else if(arr[mid]==1){
				mid++;
			}else{
				//swap(arr[mid],arr[high]
				temp = arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				
				high--;
				
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//return arr;
	}

}
