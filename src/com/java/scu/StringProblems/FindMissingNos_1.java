package com.java.scu.StringProblems;

public class FindMissingNos_1 {

	public static void main(String[] args) {
		int arr[] = {7,5,4,3,2};
		int n = 7;
		
		findTwoMissingNos_1(arr,n);
	}

	private static void findTwoMissingNos_1(int[] arr, int n) {

		int[] flag = new int[n+1];
		for(int i=0;i<arr.length;i++){
			flag[arr[i]] = 1;
		}
		for(int j=1;j<flag.length;j++){
			if(flag[j] == 0){
				System.out.print(j+" ");
			}
		}
	}

}
