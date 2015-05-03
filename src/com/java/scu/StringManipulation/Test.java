package com.java.scu.StringManipulation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,-1,-3,5,3,6,7};
		int W = 3;
		int[] B = new int[A.length-W+1];
		getMaxSlidingWindow(A,B,A.length,W);
		
		for(int i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		

	}

	private static void getMaxSlidingWindow(int[] A, int[] B, int n, int w) {
		// TODO Auto-generated method stub
		Deque<Integer> q = new ArrayDeque<Integer>();
		//1->w add into queue
		for(int i=0;i<w;i++){
			while(!q.isEmpty() && A[i] >= A[q.getLast()]){
				q.pollLast();
			}
			q.offerLast(i);
		}
		
		//i=w->n
		for(int i =w;i<n;i++){
			B[i-w] = A[q.getFirst()];
			
			while(!q.isEmpty() && A[i] >= A[q.getLast()]){
				q.pollLast();
			}
			while(!q.isEmpty()  && i-w >= q.getFirst()){
				q.pollFirst();
			}
			
			
			q.offerLast(i);
		}
		B[n-w] = A[q.getFirst()];
	}

}
