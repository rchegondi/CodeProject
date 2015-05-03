package com.java.scu.BinaryTrees;


public class Pre_In_Post_OrderTraversal {
    // Create an input  Binary Tree
	private static BinaryTreeNode buildTree1() {
		
		BinaryTreeNode root = new BinaryTreeNode(1); //root
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		root.left.right=new BinaryTreeNode(5);
		root.right.left=new BinaryTreeNode(6);
		root.right.right=new BinaryTreeNode(7);
		return root;
	}
	// get PreOrder Traversal
	public static void preOrderTraversal(BinaryTreeNode root) { //Time: O(n); Space: O(n)
		if(root!=null){
			System.out.print(root.data+" "); // data

			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
	}
	public static void inOrderTraversal(BinaryTreeNode root) { //Time: O(n); Space: O(n)
		if(root!=null){
			

			inOrderTraversal(root.left);
			System.out.print(root.data+" "); // data
			inOrderTraversal(root.right);
		}
		
	}
	public static void postOrderTraversal(BinaryTreeNode root) { //Time: O(n); Space: O(n)
		if(root!=null){
			
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" "); // data
		}
		
	}
	
	
	
	public static void main(String[] args){
		
		BinaryTreeNode bTree1 = buildTree1();
		System.out.print("PreOrder is :  ");
		preOrderTraversal(bTree1);
		System.out.println();
		
		System.out.print("InOrder is :  ");
		inOrderTraversal(bTree1);
		System.out.println();

		
		System.out.print("PostOrder is :  ");
		postOrderTraversal(bTree1);
		System.out.println();

		// Check code for LevelOrder traversal

		
	}
}
