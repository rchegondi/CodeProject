package com.java.scu.LinkedList;

public class LinkedListEndsinCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n7 = new Node(7,null);
		Node n6 = new Node(6,n7);
		Node n5 = new Node(5,n6);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		
		 n7 = new Node(7,n4);// just trying
		 System.out.println(n1);
		 
		 System.out.println("Is Having Loop : "+hasLoop(n1));
		 

	}

	private static boolean hasLoop(Node head) {
		
		if(head == null) return false;
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr!=null && fastPtr.next !=null){
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr){
				return true;
			}
		}
		return false;
	}

}
