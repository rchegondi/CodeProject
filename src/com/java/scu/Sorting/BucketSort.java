package com.java.scu.Sorting;

public class BucketSort {

	public static void main(String[] args) {
		int[] arr = {95,9 ,95, 87, 8, 81, 18, 54, 57, 53, 92, 15, 38, 24, 8, 56, 29, 69, 64, 66};
		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
			
		}
		System.out.println();
		int[] sortedArray = bucketSort(arr);
		
		for(int j=0;j<sortedArray.length;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] bucketSort(int[] arr) {
		
		int max = findMax(arr);
		//int min = findMin(arr);
		
		int BucketRange = max+1;
		int[] BUCKETS = new int[BucketRange];
		int[] sortedArr = new int[arr.length];
		int sortedSeqIndex =0;
		for(int i=0;i<arr.length;i++){
			BUCKETS[arr[i]]++;
		}
		for(int i=0;i<BUCKETS.length;i++){
			for(int j=0;j<BUCKETS[i];j++){
				sortedArr[sortedSeqIndex] = i; // not BUCKET[i]
				sortedSeqIndex++;
			}
		}
		
		return sortedArr;
	}

	private static int findMax(int[] arr) {

		int max = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		return max;
	}
	

}
