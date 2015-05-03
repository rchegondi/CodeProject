package com.java.scu.Searching;
//Seperate even and odd numbers
//Use Quick Sort principle
public class DutchNationalFlagProblem {

	public static void main(String[] args) {

		int[] arr = {12,34,45,9,8,90,3};
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] output = sepearteEvenOdd(arr);
		/*
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+" ");
		}*/
		
	}

	private static int[] sepearteEvenOdd(int[] arr) {

		int i=0,j=arr.length-1;
		//int pivot = arr[(i+j)/2];
		int temp;
		while(i<j){
			while(arr[i]%2==0){
				i++;
			}
			while(arr[j]%2==1){
				j--;
			}
			if(i<j){
				//swap
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]= temp;
				//i++;j--;
				for(int m=0;m<arr.length;m++){
					System.out.print(arr[m]+" ");
				}
				System.out.println();
			}
		}
		
		return arr;
	}

}
