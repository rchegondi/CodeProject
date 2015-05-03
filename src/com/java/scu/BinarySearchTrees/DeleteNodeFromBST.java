package com.java.scu.BinarySearchTrees;

public class DeleteNodeFromBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode root = BST_Utility.buildBST1();
		int data = 12;
		System.out.println("Is "+data+" present in tree initially "+search(root,data));
		BSTNode newRoot = delete(root, data);
		System.out.println("Is "+data+" present after delete  "+search(newRoot,data));
		
		//System.out.println(newRoot.data);

	}

	private static BSTNode delete(BSTNode root, int data) {
		if(root == null){
			return root;
		}else if(data < root.data){
			root = delete(root.left,data);
		}else if(data > root.data){
			root = delete(root.right,data);
		}
		// Wohoo... I found you, Get ready to be deleted	
		else{
			//case 1: No child
			if(root.left == null && root.right == null){
				root = null;
			}else if(root.right == null){ // one child
				BSTNode temp = root;
				root = root.left;
				temp = null;
			}else if(root.left == null){
				BSTNode temp = root;
				root = root.right;
				temp = null;
			}else{
				//Two child
				BSTNode temp = findMin(root.right);
				root.data = temp.data;
				root.right = delete(root.right,temp.data);
			}
		}
		return root;
	}

	private static BSTNode findMin(BSTNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return null;
		}
		while(root.left!=null){
			root = root.left;
		}
		return root;
	}
	
	private static boolean search(BSTNode root, int data){
		if(root == null)
			return false;
		if(root.data == data){
			return true;
		}
		if(data < root.data){
			return(search(root.left,data));
		}else{
			return(search(root.right,data));
		}
	}

}
