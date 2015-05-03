package com.java.scu.PriorityQueuesAndHeaps;

public class UtilityClass {
	
	public static Maxheap buildHeap(int[] A){
		int capacity = A.length;
		
		Maxheap mHeap = new Maxheap(capacity); 
		
		for(int i=0;i<A.length;i++){
			mHeap.array[i] = A[i];
		}
		mHeap.size = capacity;
		for(int j=(mHeap.size/2);j>=0;j--){
			mHeap.percolateDown(j);
		}
		return mHeap;
		
	}

}
