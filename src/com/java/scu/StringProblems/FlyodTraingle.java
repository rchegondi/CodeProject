package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1
 * 2 3
 * 4 5 6
 * if n of rows = 3
 * 
 * @author ravichegondi
 *
 */
public class FlyodTraingle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Number of Rows you want");
		int rows = Integer.parseInt(br.readLine());
		
		int num=1;
		for(int i=1;i<=rows;i++){
			int count=1;
			while(count<=i){
				System.out.print(num+" ");
				num++;
				count++;
			}
			System.out.println();
			
			count =1;
		}
		
	}

}
