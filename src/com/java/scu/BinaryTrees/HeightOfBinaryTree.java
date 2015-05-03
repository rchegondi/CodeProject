package com.java.scu.BinaryTrees;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode btn3 = BinaryTreeUtility.buildTree3();
		int height = heightOfBinTree(btn3);
		System.out.println(height);
	}

	private static int heightOfBinTree(BinaryTreeNode root) {
		
		int leftHeight;
		int rightHeight;
		if(root == null){
			return 0;
		}
		
		leftHeight = heightOfBinTree(root.left);
		rightHeight = heightOfBinTree(root.right);
		
		if(leftHeight > rightHeight){
			return leftHeight+1;
		}else{
			return rightHeight+1;
					
		}
		
		
	}

}
