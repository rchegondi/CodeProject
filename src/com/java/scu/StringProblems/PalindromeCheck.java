package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String to check Palidrome:");
		String input = br.readLine();
		char[] inChar = input.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i= inChar.length-1;i>=0;i--){
			sb.append(inChar[i]);
		}
		if(input.equals(sb.toString())){
			System.out.println("The String is Palidrome");
		}else{
			System.out.println("Not a Palindrome");
		}

	}

}
