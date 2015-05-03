package com.java.scu.LinkedList;


public class TestReverseLinkedList_Kitems {
    static class Node
    {
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
    public static Node head = null; //Create head node
    //Recursive Reversal of a group of k elements
    //1. Reverse the first sub-list of k element and keep track of next and previous nodes
    //2. head.next = reverse(next,k ) - recursively call this function on sub-groups
    //3. return prev  - prev becomes new next
    private static Node reverse(Node head, int k)
    {
            Node current = head;
            Node next= head, prev=null;
            int count = 0;
            //reverse first k elements
            while(current != null && count < k)
            {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current=next;
                    count ++;
            }
            //next is now pointer to k+1th node. Recursively call reverse
            //for the list starting from that point 
            if (next!=null)
            {
                    head.next = reverse(next,k);
            }
            //prev is the new head
            return prev;
    }
    
    
    public static void main(String args[])
    {
    	//TestReverseLinkedList_Kitems kll = new TestReverseLinkedList_Kitems();
    	Node n7 = new Node(7,null);
		Node n6 = new Node(6,n7);
		Node n5 = new Node(5,n6);
		Node n4 = new Node(4,n5);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
        System.out.println(n1);
		Node  head=reverse(n1, 2);
          System.out.println("===========================");
          System.out.println(head);

    }
}
