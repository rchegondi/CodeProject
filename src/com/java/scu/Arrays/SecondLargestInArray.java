package com.java.scu.Arrays;

import java.util.Random;

// This works only for 2nd biggest. To find the Kth biggest or smallest sepearte code
public class SecondLargestInArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] array = new int[20];
		
		Random randGen = new Random();
		for(int i=0 ; i< 20; i++){
			array[i] = randGen.nextInt(100);
		}
		for(int j=0;j< array.length;j++){
			System.out.print(array[j]+" ");
		}
		System.out.println();
		int first = array[0];
		int second = array[1];
		
		if(first < second){
			int temp = first;
			first = second;
			second = first;
		}
		
		for(int i=2;i<arr.length;i++){
			if(array[i] > first){
				second = first;
				first = array[i];
			}else if( array[i] > second && array[i] < first){
				second = array[i];
			}
			
		}
		System.out.println("First Biggest: "+ first);
		System.out.println("Second Biggest: "+ second);
	}

}
