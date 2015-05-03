package com.java.scu.Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeroesinFactorial {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Number!");
		int FactorialNumber = Integer.parseInt(br.readLine());
		
		getTrailingZeroes(FactorialNumber);
	}

	private static void getTrailingZeroes(int factorialNumber) {

		int count = 0;
		for(int i=5;(factorialNumber/i)>0;i=i*5){
			count+= factorialNumber/i;
		}
		
		System.out.println("No of zeores in "+factorialNumber+"! are "+count);
	}

}
