package com.java.scu.LinkedList;

class ReverseKLL
{
        static class Node
        {
                int data;
                Node next;
                Node(int data)
                {
                        this.data = data;
                        next =null;
                }
        }
        public static Node head = null; //Create head node
        //Recursive Reversal of a group of k elements
        //1. Reverse the first sub-list of k element and keep track of next and previous nodes
        //2. head.next = reverse(next,k ) - recursively call this function on sub-groups
        //3. return prev  - prev becomes new next
        private static Node reverse(Node node, int k)
        {
                Node current = node;
                Node next= node, prev=null;
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
                        node.next = reverse(next,k);
                }
                //prev is the new head
                return prev;
        }
        //utility methods
        //push a node in the ll
        private static void push(int data)
        {
                Node newnode= new Node(data);
                newnode.next = head;
                head = newnode;

        }
        public static void printList(Node node)
        {
                while (node != null)
                {
                        System.out.print(node.data);
                        node = node.next;
                }
        }
        public static void main(String args[])
        {
               ReverseKLL kll = new ReverseKLL();
               kll.push(8);
               kll.push(7);
               kll.push(6);
               kll.push(5);
               kll.push(4);
               kll.push(3);
               kll.push(2);
               kll.push(1);

               kll.printList(head);
               head=kll.reverse(head, 3);
               System.out.println("===========================");
               kll.printList(head);

        }
}