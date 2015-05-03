package com.java.scu.StringManipulation;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Source : http://flexaired.blogspot.com/2013/05/array-of-maximum-value-in-sliding-window.html
 * @author ravichegondi
 *
 */
public class MaxSlidingWindowProblem {

	public static void main(String[] args) {

		int[] A = {1,3,-1,-3,5,3,6,7};
		int W = 3;
		int[] B = new int[A.length-W+1];
		getMaxSlidingWindow(A,B,A.length,W);
		
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		
	}

	private static void getMaxSlidingWindow(int[] A, int[] B, int n, int w) {
		
	 Deque<Integer> q = new ArrayDeque<Integer>();
	 //1 -> w
	 for(int i=0;i<w;i++){
		while(!q.isEmpty() && A[i]>= A[q.getLast()]){
			q.pollLast();
		}
		q.offerLast(i);
	 }
	 
	 for(int i=w;i<n;i++){
		 B[i-w] = A[q.getFirst()];
		 
		 while(!q.isEmpty() && A[i]>= A[q.getLast()]){
			 q.pollLast();
		 }
		 while(!q.isEmpty() && i-w >= q.getFirst()){ //if window size is increasing remove the 1st ones
			 q.pollFirst();
		 }
		 q.offerLast(i);
		 
	 }
	 B[n-w] = A[q.getFirst()];
	}

}
