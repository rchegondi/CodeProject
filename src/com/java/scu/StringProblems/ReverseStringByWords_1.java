package com.java.scu.StringProblems;

public class ReverseStringByWords_1 {

	public static void main(String[] args) {
		
		String in = "Ravi Is a Good boy";
		//reverse this entire string first
		StringBuilder sb1 = new StringBuilder();
		char[] in_char = in.toCharArray();
		for(int i = in_char.length-1;i>=0;i--){
			
			sb1.append(in_char[i]);
		}
		String revStr = sb1.toString();
		//System.out.println(in.length());
		//System.out.println(sb1.length());
		System.out.println(revStr);
		char[] revStr_char = revStr.toCharArray();
		//revStr_char[revStr_char.length]= ' ';
		int startIndex =0;
		int endIndex =0;
		StringBuilder sb2 = new StringBuilder();
		for(int j=0;j<revStr_char.length;j++){
			
			if(revStr_char[j]==' '){
				endIndex = j-1;
				for(int k=endIndex;k>=startIndex;k--){
					sb2.append(revStr_char[k]);
				}
				sb2.append(' ');
				startIndex = j+1; 
				
			}
		}
		System.out.println(startIndex);
		for(int l = revStr_char.length-1;l>=startIndex;l--){
			sb2.append(revStr_char[l]);
		}
		System.out.println(sb2);
	}

}
