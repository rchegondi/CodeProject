package com.java.scu.BinarySearchTrees;

public class SearchElementInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode root = BST_Utility.buildBST1();
		int data1 = 19;
		int data2 = 22;
		System.out.println("Recursive Approach");
		System.out.println("is Data1 "+data1+" in BST "+search1(root,data1));
		System.out.println("is Data2 "+data2+" in BST "+search1(root,data2));

	}
    
	
	
	// Recursive Approach
		private static boolean search1(BSTNode root, int data) {
			if(root==null){
				return false;
			}
			if(root.data==data)
				return true;
			
			if(root.data > data)
				return search1(root.left,data);
			else
				return search1(root.right,data);
			
			
					
		}


}
