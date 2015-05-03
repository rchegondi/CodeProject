package com.java.scu.BinarySearchTrees;

public class IsBST_NewApproach {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
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

	private static boolean isBST(BSTNode root) {
		int prev = Integer.MIN_VALUE;
		if(root == null)
			return true;
		if(!isBST(root.left)){
			return false;
		}
		if(root.data <  prev){
			return false;
		}
		prev = root.data;
		return isBST(root.right);
		
		//return false;
	}

}
