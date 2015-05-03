package com.java.scu.LinkedList;


public class SinglyLinkedListReverseLast5 {
	public static void main(String[] args){
		
		Node n7 = new Node(7,null);
		Node n6 = new Node(6,n7);
		Node n5 = new Node(5,n6);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		
		int numberOfNodesToReverse = 5;
		System.out.print("Original LinkedList:   ");
		System.out.println(n1.toString());
		reverse(getNthElement(n1,numberOfNodesToReverse+1));
		System.out.print("Modified LinkedList:   ");
		System.out.println(n1.toString());
		
		System.out.println("Test");
		reverse(n1);
		System.out.println(n1.toString());
		
		
	}

	private static void reverse(Node head) {
		// TODO Auto-generated method stub
		Node current = null;
		Node next;
		Node first = head;
		head = head.next;
		while(head!=null){
			next = head.next;
			head.next = current;
			current = head;
			head = next;
		}
		System.out.println("first list");
		System.out.println(first.toString());
		first.next = current;
		
	}

	private static Node getNthElement(Node head, int n) {
		// TODO Auto-generated method stub
		Node f_ptr = head;
		Node s_ptr = head;
		
		for(;n>0;n--){
				f_ptr = f_ptr.next;
		}
		while(f_ptr!=null){
			f_ptr=f_ptr.next;
			s_ptr=s_ptr.next;
		}
		System.out.println(s_ptr.toString());
		return s_ptr;
	}
}
