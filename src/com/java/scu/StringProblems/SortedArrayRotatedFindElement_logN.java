package com.java.scu.StringProblems;

// find pivot element   : logN
// And use Binary Search to find element : logN
public class SortedArrayRotatedFindElement_logN {

	public static void main(String[] args) {

		int[] arr = {15,16,17,19,20,25,1,2,3,4,5,7,10,14};
		int element = 19;
		int n = arr.length;
		int position = searchElement(arr,n,element);
		if(position!=-1)
		System.out.println("Position of element "+element+" is : "+position);
		else{
			System.out.println(" element not found");
		}
	}

	private static int searchElement(int[] arr, int n, int element) {
		//find Pivot position
		System.out.println("start finding pivot");
		int pivot = findPivot(arr,0,n-1);
		System.out.println("Pivot position"+pivot);
		System.out.println("pivot element"+arr[pivot]);
		if(arr[pivot] == element){
			return pivot;
		}else if(arr[pivot] <= element){
			return binarySearch(arr,0,pivot,element);
		}else{
			return binarySearch(arr,pivot+1,n-1,element);
		}
		
			
		
		
		//return 0;
	}

	private static int binarySearch(int[] arr, int low, int high, int element) {
		if(high >= low){
			int mid = low+(high-low)/2;
			if(element == arr[mid]){
				return mid;
			}else if(element < arr[mid]){
				return binarySearch(arr, low, mid, element);
			}else{
				return binarySearch(arr, mid+1, high, element);
			}
		}else{
			return -1;
		}
		
		//return 0;
	}

	private static int findPivot(int[] arr, int start, int finish) {
		
		if(start == finish){
			return start;
		}else if(start == finish-1){
			if(arr[start]>=arr[finish]){
				return start;
			}else{
				return finish;
			}
		}else{
			int mid = start+(finish-start)/2;
			if(arr[start] <=arr[mid]){//left looks good
				return findPivot(arr,mid,finish);
			}else{//right looks good
				return findPivot(arr, start, mid);
			}
		}
		
		
		
	}

}
