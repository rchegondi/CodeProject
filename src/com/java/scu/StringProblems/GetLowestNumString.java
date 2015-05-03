package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetLowestNumString {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Number");
		String number = br.readLine();
		System.out.println("Enter no. of characters");
		int n = Integer.parseInt(br.readLine());
		
        String lowestNumber = getLowestNumString(number,n);
        System.out.println(lowestNumber);
	}

	private static String getLowestNumString(String str, int num) {
		if(num==0){
			return str;
		}
		int index = str.length()-1;
		for(int i=0;i<str.length()-1;i++){
			if(getNum(str,i) > getNum(str,i+1)){
				index = i;
				break;
				
			}
		}
		String newStr = str.substring(0,index);
		if(index<str.length()-2){
			newStr+=str.substring(index+1);
		}
		return getLowestNumString(newStr,num-1);
	}

	static int getNum(final String str, final int index) {
		return Character.getNumericValue(str.charAt(index));
	}
	

}
