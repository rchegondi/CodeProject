package com.java.scu.StringProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FirstElementRepeated {

	public static void main(String[] args) {

		int[] arr = {3,2,1,2,2,3}; // output should be 3 (Not 2)
		get1stRepeatedNumberInArray(arr);
	}

	private static void get1stRepeatedNumberInArray(int[] arr) {
		
		

		HashMap map = new HashMap();
		
		int value =0;
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				value = (Integer) map.get(arr[i]);
				if(value<0){
					map.put(arr[i], value);
				}
				map.put(arr[i], -value);
			}else{
				map.put(arr[i], i+1);
			}
		}
		
		Iterator itr = map.entrySet().iterator();
		Map.Entry entry;
		//find max negative VALUE
		
		int maxNegativeValue=-1000;
		int maxKey=0;
		//int tempVal = 0;
		while(itr.hasNext()){
			entry = (Entry) itr.next();
			if((Integer)entry.getValue() > maxNegativeValue && (Integer)entry.getValue()<0){
				maxNegativeValue = (Integer)entry.getValue();
				maxKey = (Integer)entry.getKey();
			}
			
			
		}
		System.out.println("The first repeated number is "+maxKey);
	}

}
