package com.java.scu.StringProblems;

import java.util.HashMap;

public class LongestSubStringLength {

	public static void main(String[] args) {
 
		String input = "geeksforgeeks";
		int maxLen =0;
		int lastDup =0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] inChar = input.toCharArray();
		for(int i=0;i<inChar.length;i++){
			char c = inChar[i];
			if(!map.containsKey(c)){
				map.put(c, i);
			}else{
				lastDup =i;
				map.put(c, i);
			}
			if(maxLen < i-lastDup+2){
				maxLen = i-lastDup+2;
			}
		}
		System.out.println(maxLen);
	}

}
