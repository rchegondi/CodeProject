package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Input: Ravi is good boy.  
 *          (&)
 *        good
 * output:Ravi is by.
 * It removes all the characters of 'good' from input string.     
 * @author ravichegondi
 *
 */
public class DeleteCharFromString {
	
	
	private static String deleteCharFromString(String input,String remove){
		char[] inChar = input.trim().toCharArray();
		char[] remChar = remove.toCharArray();
		StringBuilder sb = new StringBuilder(); // to build the final output
		
		boolean[] flag = new boolean[256]; 
		/*
		 * flag all characters in removal string to 'true'.
		 * And verify the input string with these flags.
		 */
		
		for(int i = 0;i<remChar.length;i++){
			flag[remChar[i]] = true;
		}
		for(int j=0;j<inChar.length;j++){
			if(!flag[inChar[j]]){// flag of g from good is true. r from good is false.
			sb.append(inChar[j]);	
			}
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) throws IOException {
		
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String: ");
		String in = br.readLine();
		System.out.println("Enter characters u wanted to remove: ");
		String remove = br.readLine();
		
		String out = deleteCharFromString(in,remove);
		System.out.println("After Removal :"+out);

	}

}
