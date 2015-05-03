package com.java.scu.PriorityQueuesAndHeaps;

public class Heap {
	int[] array;
	int count;
	int capacity;
	int heap_type;
	
	// create heap
	public Heap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array = new int[capacity];
		
	}// Time Complexity O(1)s
	
	// get Parent Position of ithNode
	public int parent(int i){
		if(i<=0 || i>= this.count){
			return -1;
		}else{
			return (i-1)/2;
		}
	} 
	
	// get Left Child of a Node
	public int leftChild(int i){
		int left = 2*i+1;
		if(left >=this.count){
			return -1;
		}else{
			return left;
		}
	}
	// get right child position
	public int rightChild(int i){
		int right = 2*i+2;
		if(right >=this.count){
			return -1;
		}else{
			return right;
		}
	}
	// the root is the max item in MaxHeap
	public int getMaximum(){
		if(this.count == 0){
			return -1;
		}else{
			return this.array[0];
		}
	}
	
	//----------------------------------------------//
    //Heapifying the element at position i|| PercolateDown || heapify Down//
	public void percolateDown(int i){ // Heap is a complete Binary tree. Time Comp : O(logN): height of Btree 
		int left,right;
		int maxPos;
		int temp;
		left = leftChild(i);
		right = rightChild(i);
		
		if(left!= -1 && this.array[left] > this.array[i]){
			maxPos = left;
		}else{
			maxPos = i;
		}
		
		
		if(right!=-1 && this.array[right] > this.array[maxPos]){
			maxPos = right;
		}
		if(maxPos != i){
			temp = this.array[maxPos];
			this.array[maxPos] = this.array[i];
			this.array[i] = temp;
		}
		percolateDown(maxPos);
	}
	
	// Deleting an  element. Delete the root and after deleting, copy the last to this place and Heapify
	public int deleteMax(){ 
		if(this.count == 0){
			return -1;
			
		}
		int data = this.array[0];
		this.array[0] = this.array[count-1];
		this.count--;
		percolateDown(0);
		return data;
		
	} // O(logN)
	
	/*Insertion:
	 * increase the this.count
	 * Add at the end of the heap.
	 * Heapify from bottom to Top
	 */
	public void insert(int data){
		int i;
		if(this .count == this.capacity){
			// resize the heap
		}else{
			this.count++;
			//this.array[count-1] = data;
			i = this.count-1;
			while(i>=0 && data > this.array[(i-1)/2] ){
				i = (i-1)/2;
			}
			this.array[i] = data;
			
		}
		//return i;
	}
	
	//Build heap takes NlogN, by adding n elements to Heap
	public void BuildHeap(Heap h, int[] A, int n){
		if(h==null){
			return;
		}
		while(n>this.capacity){
			//resizeHeap
		}
		for(int i=0; i<n;i++){
			h.array[i] = A[i];
		}
		this.count = n;
		for(int i = n/2 ; i>0; --i){
			h.percolateDown(i);
		}
	}
	
	public void resizeHeap(){
		int[] arr_old = new int[this.capacity];
		System.arraycopy(this.array, 0, arr_old, this.count-1, capacity);
	}
	
	
}
