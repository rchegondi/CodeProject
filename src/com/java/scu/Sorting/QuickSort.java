package com.java.scu.Sorting;

// Has to work on it ot complete
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {3,8,1,4,9,10,5,7,2,6};
		int[] sortedArray = quickSort(arr,0,arr.length-1);
		
		for(int j=0;j<=sortedArray.length-1;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] quickSort(int[] arr,int left,int right) {
		
		int pivot;
		//Termination condition
		
		if(right>left){
			pivot = partition(arr, left,right);
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot,right);
			
		}
		
	
		return arr;
		
		
	}
    //elements before pivot is lesser and after the pivot is greater than Pindex
	private static int partition(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int temp;
		int pivot_item = arr[(left+right)/2];
		
		while(i<j){
			while(arr[i]<= pivot_item){
				i++;
			}
			while(arr[j]>pivot_item){
				j--;
			}
			if(i<j){
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		arr[left] = arr[right];
		arr[right] = pivot_item;
		return right;
		}

}
