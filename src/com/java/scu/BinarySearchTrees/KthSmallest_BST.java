package com.java.scu.BinarySearchTrees;

public class KthSmallest_BST {

	public static void main(String[] args) {

		BSTNode root = BST_Utility.buildBST2();
		int k = 3;
		int count =0;
		
		getKthSmallest(root,k,count);
	    
	}

	private static void getKthSmallest(BSTNode root, int k, int count) {
		//System.out.println("test1");
		if(root == null){
			System.out.println("Tree is Empty");
		    return ;	
		} 
		if(root.left!=null){
			//System.out.println(root.data);
			getKthSmallest(root.left, k,count);
		}
		if(count++ == k){
			System.out.println("The Kth smallest element is : "+root.data);
			System.exit(0);
			//return root;
		}
		if(root.right!=null){
			 getKthSmallest(root.right,k,count);
		}
		
		//return root.data;
		    
	}
	

}
