package com.java.scu.Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("--------------------");
		for(int j=0;j<=arr.length-1;j++){
			System.out.print(arr[j]+" ");
			
		}
		
		
		System.out.println();
		System.out.println("--------------------");
		int[] sortedArray = insertionSort(arr);
		
		for(int j=0;j<=sortedArray.length-1;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] insertionSort(int[] A) {

		int i,j,key;
		for(j=1;j<A.length;j++){
			key=A[j];
			for(i=j-1;(i>=0)&&(A[i]> key);i--){
				A[i+1]=A[i];
				
			}
			A[i+1]=key;
			
			for(int k =0; k< A.length;k++){
				System.out.print(A[k]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("--------------------");
		return A;
	}

}
