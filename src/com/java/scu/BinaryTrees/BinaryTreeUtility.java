package com.java.scu.BinaryTrees;

public class BinaryTreeUtility {

public static BinaryTreeNode buildTree1() {
		
		BinaryTreeNode root = new BinaryTreeNode(1); //root
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		root.left.right=new BinaryTreeNode(5);
		root.right.left=new BinaryTreeNode(6);
		root.right.right=new BinaryTreeNode(7);
		//root.right.right.right = new BinaryTreeNode(25);
		return root;
		
	}
public static BinaryTreeNode buildTree2() {
	
	BinaryTreeNode root = new BinaryTreeNode(4); //root
	root.left=new BinaryTreeNode(6);
	root.right=new BinaryTreeNode(2);
	root.left.left=new BinaryTreeNode(14);
	root.left.right=new BinaryTreeNode(54);
	root.right.left=new BinaryTreeNode(33);
	root.right.right=new BinaryTreeNode(16);
	return root;
	
}

public static BinaryTreeNode buildTree3() {
	
	BinaryTreeNode root = new BinaryTreeNode(1); //root
	root.left=new BinaryTreeNode(2);
	root.right=new BinaryTreeNode(3);
	root.left.left=new BinaryTreeNode(4);
	root.left.right=new BinaryTreeNode(5);
	root.right.left=new BinaryTreeNode(6);
	root.right.right=new BinaryTreeNode(7);
	
	root.left.left.left=new BinaryTreeNode(8);
	root.left.left.right=new BinaryTreeNode(9);
	root.left.right.left.left=new BinaryTreeNode(10);
	root.left.right.left.right=new BinaryTreeNode(11);
	
	root.right.right.right=new BinaryTreeNode(12);
	root.right.right.right.left=new BinaryTreeNode(13);
	root.right.right.right.right=new BinaryTreeNode(14);
	
	root.right.right.right.right.left=new BinaryTreeNode(15);
	root.right.right.right.right.left.right=new BinaryTreeNode(16);

	return root;
	
}
// trees 3 and 4 not properly organized
public static BinaryTreeNode buildTree4(){
	BinaryTreeNode root = new BinaryTreeNode(1); //root
	root.left = new BinaryTreeNode(2);
	root.right = new BinaryTreeNode(3);
	
	root.left.left = new BinaryTreeNode(4);
	root.left.right = new BinaryTreeNode(5);
	root.right.left = new BinaryTreeNode(6);
	root.right.right = new BinaryTreeNode(7);
	
	root.left.left.left = new BinaryTreeNode(8);
	root.left.left.right = new BinaryTreeNode(9);
	root.left.left.right.left = new BinaryTreeNode(9);
	root.left.left.right.right = new BinaryTreeNode(10);
	
	root.right.right.left = new BinaryTreeNode(11);
	root.right.right.right = new BinaryTreeNode(20);

	return root;
			
	
}
}
