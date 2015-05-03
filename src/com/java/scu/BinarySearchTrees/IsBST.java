package com.java.scu.BinarySearchTrees;


public class IsBST {
	public static void main(String[] args){
		
		BSTNode root1 = BST_Utility.buildBST1();
		BSTNode root2 = BST_Utility.buildBST2(); // is not BST
		
		boolean result1 = isBST(root1);
		if(result1)
		System.out.println("Tree1 is BST");
		else
			System.out.println("Tree1 is not BST");
		
		boolean result2 = isBST(root2);
		if(result2)
			System.out.println("Tree2 is BST");
			else
				System.out.println("Tree2 is not BST");
			
	}

	public static boolean isBST(BSTNode root) {
		
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	public static boolean isBST(BSTNode root, int minValue, int maxValue) {
		if(root == null)
			return true;
		return(root.data > minValue && root.data < maxValue 
				&& isBST(root.left,minValue,root.data) && isBST(root.right,root.data,maxValue));
	}

	
}
