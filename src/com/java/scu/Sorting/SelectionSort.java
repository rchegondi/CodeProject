package com.java.scu.Sorting;

public class SelectionSort {

	public static void main(String[] args) {


		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("--------------------");
		for(int k =0; k< arr.length;k++){
			System.out.print(arr[k]+" ");			
		}
		System.out.println();
		System.out.println("--------------------");
		int[] sortedArray = selectionSort(arr);
		
		
		//System.out.println("--------------------");
		
		for(int j=0;j<=sortedArray.length-1;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] selectionSort(int[] A) {
		
		int min,temp;
		for(int i=0;i<A.length-2;i++){
			min =i;
			for(int j=i+1;j<A.length;j++){
				if(A[j]<A[min]){
					min=j;
				}
				
			}
			//swap;
			temp=A[min];
			A[min]=A[i];
			A[i]=temp;
			for(int k=0;k<A.length;k++){
				System.out.print(A[k]+" ");
			}
			System.out.println();
			
		}
		System.out.println("--------------------");
		//System.out.println();
	

		return A;
	}

}
