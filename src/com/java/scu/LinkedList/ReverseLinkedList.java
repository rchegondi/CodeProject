package com.java.scu.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node n7 = new Node(7,null);
		Node n6 = new Node(6,n7);
		Node n5 = new Node(5,n6);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		
		//System.out.println("reversed Linkedlist : "+getReverse(n1).toString());
		getReverse(n1);
	}

	private static void getReverse(Node head) {
		if (head == null || head.next == null)
			return;  //empty or just one node in list

			Node Second = head.next;

			//store third node before we change 
			Node Third = Second.next;  

			//Second's next pointer
			Second.next = head;  //second now points to head
			head.next = null;  //change head pointer to NULL
			//System.out.println(Second);
			//System.out.println(Third);

			//only two nodes, which we already reversed
			if (Third == null)
			return; 
			Node CurrentNode = Third;
			Node PreviousNode = Second;
			while (CurrentNode != null)
			{ 
			Node NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			/*  repeat the process, but have to reset
			     the PreviousNode and CurrentNode
			*/
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;  
			}
			System.out.println("Prev Node: "+PreviousNode);
			head  = PreviousNode; //reset the head node}
	
			System.out.println(head);

}
}
