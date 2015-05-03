package com.java.scu.StringProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		int[] arr = {2,3,2,1,2,2,1,3};
		get1stRepeatedNumber(arr);
		
		
	}

	@SuppressWarnings("unchecked")
	private static void get1stRepeatedNumber(int[] arr) {

		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(hMap.containsKey(arr[i])){
				int value = hMap.get(arr[i]);
				if(value<0){
					hMap.put(arr[i], value);
				}else{
					hMap.put(arr[i], -value);
				}
				
			}else{
				hMap.put(arr[i], i+1);
			}
		}//HashMap constructed
		
		
		Iterator<Map.Entry<Integer, Integer>> itr = hMap.entrySet().iterator();
		Map.Entry<Integer,Integer> entry;
		int maxNegVal = Integer.MIN_VALUE;
		int maxKey = 0;
		while(itr.hasNext()){
			entry = (Entry<Integer, Integer>) itr.next();
			if(entry.getValue()>maxNegVal && entry.getValue()<0){
				maxNegVal = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		
		System.out.println(maxKey);
	}

}
