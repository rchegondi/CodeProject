package com.java.scu.BinarySearchTrees;

public class BST_Utility {
	
	//is a BST
	public static BSTNode buildBST1(){
		BSTNode root1 = new BSTNode(5);
		root1.left = new BSTNode(2);
		root1.right = new BSTNode(12);		
		root1.left.left = new BSTNode(-4);
		root1.left.left.left = null;
		root1.left.left.right = null;
		
		root1.left.right = new BSTNode(3);
		root1.left.right.left = null;
		root1.left.right.right = null;
		
		root1.right.left = new BSTNode(9);
		root1.right.left.left = null;
		root1.right.left.right = new BSTNode(10);
		
		root1.right.right = new BSTNode(21);
		root1.right.right.left = new BSTNode(19);
		root1.right.right.left.left = null;
		root1.right.right.left.right = null;
		
		
		root1.right.right.right = new BSTNode(25);
		root1.right.right.right.left = null;
		root1.right.right.right.right = null;
		return root1;
	}
	//Not a BST
	public static BSTNode buildBST2(){
		BSTNode root2 = new BSTNode(5);
		root2.left = new BSTNode(2);
		root2.right = new BSTNode(12);		
		root2.left.left = new BSTNode(-4);
		root2.left.right = new BSTNode(3);
		root2.right.left = new BSTNode(9);
		root2.right.right = new BSTNode(21);
		root2.right.right.left = new BSTNode(19);
		root2.right.right.right = new BSTNode(2);
		return root2;
	}

}
