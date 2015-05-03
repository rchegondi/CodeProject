package com.java.scu.LinkedList;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n7 = new Node(7,null);
		Node n6 = new Node(6,n7);
		Node n5 = new Node(5,n6);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		int nthNodefromEnd = 5;
		Node nthNode4mEnd = getNthNodeFromEnd(n1,nthNodefromEnd);
		System.out.println(nthNode4mEnd.value);

	}

	private static Node getNthNodeFromEnd(Node head, int n) {
		if(head==null){
			return null;
		}
		Node ptr1 = head;
		Node ptr2 = null;
		for(int i =1 ;i<n;i++){
			ptr1 = ptr1.next;
		}
		while(ptr1!=null){
			if(ptr2==null){
				ptr2 =head;
			}else{
			ptr2 = ptr2.next;
			}
			ptr1 = ptr1.next;
		}
		return ptr2;
	}

}
