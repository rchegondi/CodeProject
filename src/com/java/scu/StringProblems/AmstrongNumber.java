package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("check for Armstrong number");
		int n = Integer.parseInt(br.readLine());
		int num =n;
		int x =0;
		int sum =0;
		
		while(n>0){
			x = n%10;
			sum = sum+(x*x*x);
			n = n/10;
		}
		if(sum == num){
			System.out.println("It is an Armstrong Number");
		}else{
			System.out.println("Not an Amstrong");
		}
		
	}

}
