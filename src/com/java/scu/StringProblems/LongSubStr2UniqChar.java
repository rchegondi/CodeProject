package com.java.scu.StringProblems;

import java.util.HashSet;

//This can be generalized with k unique characters.
public class LongSubStr2UniqChar {
	
	private String subString(String input) {
		
		char[] arr = input.toCharArray();
		int max = 0;
		int j = 0;
		int m = 0, n = 0;
		HashSet<Character> set = new HashSet<Character>();
		set.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (set.add(arr[i])) {
				if (set.size() > 1) {
					String str = input.substring(j, i);
					//keep the last character only
					set.clear();
					set.add(arr[i - 1]);
	 
					if ((i - j) > max) {
						m = j;
						n = i - 1;
						max = i - j;
					}
	 
					j = i - helper(str);
				}
			}
		}
		
		return input.substring(m, n + 1);
	}
	
	
	
	// This method returns the length that contains only one character from right side. 
	public int helper(String str) {
		
		// null & illegal checking here
		if(str == null){
			return 0;
		}
	 
		if(str.length() == 1){
			return 1;
		}
	 
		char[] arr = str.toCharArray();
		char p = arr[arr.length - 1];
		int result = 1;
	 
		for (int i = arr.length - 2; i >= 0; i--) {
			if (p == arr[i]) {
				result++;
			} else {
				break;
			}
		}
	 
		return result;
	}




	public static void main(String[] args) {
		
		String input = "geeksforgeeks";
		LongSubStr2UniqChar subStr = new LongSubStr2UniqChar();
		String output = subStr.subString(input);
		
		System.out.println("The input is : "+input);
		System.out.println("The Output is : "+output);

	}

	

}
