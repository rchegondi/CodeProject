package com.java.scu.Stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MinMaxStack extends Stack<Integer>{
	
	private Stack<Integer> minStack;
	private Stack<Integer> maxStack;
	
	public MinMaxStack(){
		minStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
		
	}
	public void push(int value){
		
		if(minStack.isEmpty()){
			minStack.push(value);
		}else if( value <= minStack.peek()){
			minStack.push(value);
		}
		if(maxStack.isEmpty()){
			maxStack.push(value);
		}else if( value >= maxStack.peek()){
			maxStack.push(value);
		}
		
		
		super.push(value);
	}
	
	public Integer pop(){
	int value = super.pop();
	if(value == getMin()){
		minStack.pop();
	}
	if(value == getMax()){
		maxStack.pop();
	}
	return value;
	}
	/*
	public Integer peek(){
		return super.peek();
	}*/
	
	public int getMin(){
	 if(!minStack.isEmpty())
	 {
		return minStack.peek();
	 }
	 else throw new NoSuchElementException("No elements");
	}
	
	public int getMax(){
		if(!maxStack.isEmpty()){
			return maxStack.peek();
		}else
			throw new NoSuchElementException("No elements");
	}
	public boolean isEmpty(){
		return super.size() == 0;
	}
	
}
