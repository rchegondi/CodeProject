package com.java.scu.GrayCodeProblems;

public class CheckForGrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 13;
		if(((a ^ 1) == b || (b== (a^((a&a)<<1))  )  )){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

	}

}
