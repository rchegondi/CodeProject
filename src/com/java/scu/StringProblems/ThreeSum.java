package com.java.scu.StringProblems;

import java.util.Arrays;
import java.util.Hashtable;

public class ThreeSum {

	public static void main(String[] args) {
    
		
	int[] array = {1,2,3,4,5,6};
    int sum = 15;
    String output = getThreeSum(array,sum); 
    
    
    System.out.println(output);
    //System.out.println(output2);
	}
	
	
	

	




	//n power 2 implementation
	private static String getThreeSum(int[] array, int sum) {
		int x=0;
		int y=0;
		int temp1=0;
		int temp2 = 0;
		String output="";
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		for(int z= 0;z<array.length;z++){
			ht.put(array[z],array[z]);
		}
		for(int i = 0;i< array.length;i++){
			x = array[i];
			temp1 = sum-x;
			for(int j=i+1;j<array.length;j++){
				y = array[j];
				temp2 = temp1-y;
				if(ht.contains(temp2)){
					output= x+","+y+","+temp2;
					//System.out.println("x:"+x);
					//System.out.println("y:"+y);
					//System.out.println("temp2:"+temp2);
					break;

				}
			}
			
		}
		return output;
		
	}
	private static boolean SumProblem(int[] arr,int sum) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int j;
		int k;
		if(arr.length == 0 || arr.length == 1 || arr.length == 2){
			return false;
		}else{
			for (int i = 0; i < arr.length-2; i++) {
					j = i+1;
					k = arr.length-1;
				while(j<k){
					if((arr[i]+arr[j]+arr[k]) == sum){
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						i++;
					}else if((arr[i]+arr[j]+arr[k]) < sum)
						j++;
					else
						k--;
				}
			}
			return false;
		}

}
}
