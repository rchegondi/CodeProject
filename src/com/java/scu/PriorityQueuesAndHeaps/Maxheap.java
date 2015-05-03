package com.java.scu.PriorityQueuesAndHeaps;

public class Maxheap {

	int[] array;
	int capacity;
	int size;
	
	public Maxheap(int capacity){
		this.capacity = capacity;
		this.size =0;
		this.array = new int[capacity];
	}
	
	public int getParentPos(int i){
		if(i<=0 || i>=size){
			return -1;
		}else{
			return ((i-1)/2);
		}
	}
	
	public int leftChild(int i){
		int left;
		if(i>=size ||i<0){
			return -1;
		}else{
			left = 2*i+1;
		}
		if(left>=size){
			return -1;
		}else{
			return left;
		}
	}
	
	public int rightChild(int i){

		int right;
		if(i>=size ||i<0){
			return -1;
		}else{
			right = 2*i+2;
		}
		if(right>=size){
			return -1;
		}else{
			return right;
		}
	
	}
	public int getMaximum(){
		if(this.size == 0){
			return -1;
		}else{
			return this.array[0];
		}
	}
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
	
	public int deleteMax(){
		int value;
		if(this.size == 0){
			return -1;
			
		}else{
			value = this.array[0];
			this.array[0] = this.array[size-1];
			size--;
			percolateDown(0);
			return value;
		}
	}
	
	

}
