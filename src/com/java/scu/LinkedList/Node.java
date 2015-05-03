package com.java.scu.LinkedList;


class Node{
	int value;
	Node next;
    
	Node(Node next){
		this.next = next;
	}
	Node(int value,Node next){
    	this.value = value;
    	this.next = next;
    }
	
	public String toString(){
		String result = value+" ";
		if(next!=null){
			result+=next.toString();
		}
		return result;
	}
}