package com.java.scu.StringProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates4mNArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2=  {1,2,3,7,4,1,8,9,7};
		int[] arr3 = {1,3,5,7,9,2,1,4,6,5,8};
		
		ArrayList result1 = new ArrayList();
		ArrayList result2 = new ArrayList();
		
		Set set = new HashSet();
		for(int item1:arr1){
			set.add(item1);
		}
		
		System.out.println(set);
		for(int item2:arr2){
			if(!set.add(item2)){
				result1.add(item2);	
			}
		}
		set.clear();
		set.addAll(result1);
		System.out.println(result1);
		for(int item3:arr3){
			if(set.contains(item3)){
				result2.add(item3);
			}
		}
		
		System.out.println(result2);

	}

}
