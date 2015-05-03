package com.java.scu.Sorting;

// Understand the concept first
// Source: https://www.youtube.com/watch?v=5rLrRpcBCzo   (the final for loop implemented from this )
//         http://www.sanfoundry.com/java-program-implement-counting-sort/ (the reaminig part from here)
public class CountingSort {

	public static void main(String[] args) {
		
		int[] A = {10,6,8,1,10,5,2,7,9,10,9,2,2,6,0,6,10};
		
		countingSort(A);
	}

	public static void countingSort(int[] arr){
		final int MAX_RANGE = 100000;
		int N = arr.length;
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0;i<N;i++){
			
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int range = max-min+1;
		if(range > MAX_RANGE){
			System.out.println("Out of range");
			return;
		}
		int count[] = new int[range];
		//increase the count.
		for(int j=0;j<arr.length;j++){
			count[arr[j]-min]++;
		}
		System.out.println();
		
	
		
		//modify the counts
		for(int m =1;m<range;m++){
			count[m]+= count[m-1];
		}
		
		for(int a = 0;a < arr.length;a++){
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		for(int b = 0;b < count.length;b++){
			System.out.print(count[b]+" ");
		}
		System.out.println();
		System.out.println("Output Starts here");
		
		int[] B = new int[N];
		
		for(int i=arr.length-1;i>=0;i--){
			int temp = arr[i];
			int position= count[temp];
			//int positionVal = position-1;
			B[position-1] = temp;
			count[temp]--;
		}
		
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		
	}

}
