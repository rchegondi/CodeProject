package com.java.scu.Sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {3,8,1,4,9,11,5,7,15,6};
		int[] sortedArray = bubbleSort(arr);
		
		for(int j=0;j<=sortedArray.length-1;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] bubbleSort(int[] A) {
		
		int len = A.length;
		int temp;
		for(int pass=len-1;pass>=0;pass--){
			
			for(int i=0;i<=pass-1;i++){
				if(A[i] > A[i+1]){
					//swap
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					
				}
			}
		}
		
		return A;
	}

}
