package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("No. of primes u want to print: ");
		int n = Integer.parseInt(br.readLine());
		if(n>=1){
			System.out.println("The prime numbers are:");
			System.out.println(2);
		}
		//start with 3 with count =2(<=n)
        int num =3;
        int count=2;
        int status =1;
        while(count<=n){
        	for(int j=2;j<=Math.sqrt(num);j++){
        		if(num%j==0){
        			status =0;// divisible a some number
        			break;
        		}
        	}
        	if(status ==1){// not divisible by any number
        		System.out.println(num);
        		count++;
        	}
        	status =1;
        	num++;
        }
		
	}

}
