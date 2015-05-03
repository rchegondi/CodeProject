package com.java.scu.StringManipulation;


public class SheSellsSeaShells {

	public static void main(String[] args) {

		String text = "she sells sea shells at sea shore";
		String pattern = "shell";
		isPatternMatching(text,pattern); // BruteForce
	}
	
	
    //This is a brute force approach
	private static void isPatternMatching(String text, String pattern) {

		int n= text.length();
		int m= pattern.length();
		
		for(int i=0;i<=n-m;i++){
			int j=0;
			while(j<m && pattern.charAt(j)==text.charAt(i+j)){
				j++;
			}
			if(j==m){
				System.out.println("Brute Force: O(NM)position at "+i);
			}
		}
	}
	
	

}
