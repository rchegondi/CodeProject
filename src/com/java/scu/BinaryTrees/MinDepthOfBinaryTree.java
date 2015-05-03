package com.java.scu.BinaryTrees;

public class MinDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = BinaryTreeUtility.buildTree3();
		int minHeight = minDepth(root);
		System.out.println("MinHeight is "+minHeight);

	}

	private static int minDepth(BinaryTreeNode root) {

		//int height = 0;
		if(root == null)
			return 0;
		if(root.left == null){
			return 1+minDepth(root.right);
		}
		if(root.right == null){
			return 1+minDepth(root.left);
		}
		
		return 1+Math.min(minDepth(root.left),minDepth(root.right));
	}

}
