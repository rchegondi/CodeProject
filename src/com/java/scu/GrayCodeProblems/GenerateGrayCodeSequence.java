package com.java.scu.GrayCodeProblems;

import java.util.ArrayList;


public class GenerateGrayCodeSequence {
	
	public static void main(String[] args){
		int n = 4;
		ArrayList<Integer> result = generateGrayCodeSequence(n);
		System.out.println(result);
	}

	private static ArrayList<Integer> generateGrayCodeSequence(int n) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(0);
		if(n<1){
			return res;
		}
		res.add(1);
		int width = 1;
		int add = 1;
		while(width < n){
			add = add << 1;
			res = nextGrayCodeSequence(res,add);
			width++;
		}
		
		return res;
	}

	private static ArrayList<Integer> nextGrayCodeSequence(
			ArrayList<Integer> res, int add) {
		for(int i = res.size()-1;i>=0;i--){
			res.add(res.get(i)+ add);
		}
		
		return res;
	}
}
