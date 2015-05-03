package com.java.scu.BinarySearchTrees;

public class RangePrinter_BST {

	public static void main(String[] args) {

		int k1 = -10;
		int k2 = 100;
		BSTNode root = BST_Utility.buildBST1();
		RangePrinter(root,k1,k2);
	}

	private static void RangePrinter(BSTNode root, int k1, int k2) {

		if(root==null){
			return;
		}
		if(root.data >= k1){
			RangePrinter(root.left,k1,k2);
		}
		if(root.data >=k1 && root.data <=k2){
			System.out.print(root.data+" ");
		}
		if(root.data <=k2){
			RangePrinter(root.right,k1,k2);
		}
	}

}
