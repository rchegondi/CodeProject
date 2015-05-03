package com.java.scu.StringManipulation;

public class PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permuteString("","ABCD");
		

	}

	private static void permuteString(String begStr, String endStr) {
		//System.out.println("BegStr:"+begStr+" EndStr:"+endStr);
		if(endStr.length()<=1){
			System.out.print(begStr+endStr+",");
		}else{
			for(int i =0;i<endStr.length();i++){
				String newString = endStr.substring(0, i)+endStr.substring(i+1);
				//System.out.println("newStr: "+newString);
				permuteString(begStr+endStr.charAt(i),newString);
			}
		}
		
	}

}
