package com.java.scu.StringProblems;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {

	public static void main(String[] args) {
    int[] array = {11,2,8,4,6,10,7};
    int sum = 15;
    //linear time implementation
    String output = logNTwoSum(array,sum);
    System.out.println(output);
	}

	//Time complexity: O(n); space: O(n)
	private static String linearTwoSum(int[] array, int sum) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		
		for(int i = 0; i < array.length-1;i++){
			ht.put(array[i],array[i] );
		}
		String output = "";
		for(int j=0; j< array.length-1;j++){
			int lookfor = sum-array[j];
			if(ht.containsKey(lookfor)){
				output = array[j]+" "+lookfor;
				break;
			}
		}
		return output;
	}
	
	//O(nlogn)
	private static String logNTwoSum(int[] array, int sum){
		Arrays.sort(array);
		String out = "";
		//i is start pointer j is end pointer
		int i =0;
		int j = array.length-1;
		while(i<=j){
			if(array[i]+array[j]==sum){
				//System.out.println(array[i]+" "+array[j]);
				out = array[i]+" "+array[j];
				return out;
			}else if(array[i]+array[j] < sum){
				i++;
			}else{
				j--;
			}
		}
		
		return out;
	} 

}
