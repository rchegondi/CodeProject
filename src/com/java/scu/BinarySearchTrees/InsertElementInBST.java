package com.java.scu.BinarySearchTrees;

public class InsertElementInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTNode root = BST_Utility.buildBST1();
		int data = 7;
		System.out.println("Is "+data+" present in tree initially "+search(root,data));
		System.out.println("Inserted. Now root is  "+insert(root,data).data);
		System.out.println("Is "+data+" present after insert  "+search(root,data));

		
		
	}

	private static BSTNode insert(BSTNode root, int data) {
		if(root == null){
			root = new BSTNode();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
			
			return root;
		}else{
			if(data < root.data){
				root.setLeft(insert(root.left,data));
			}else if(data > root.data){
				root.setRight(insert(root.right,data));
			}
		}
		
		return root;
	}
	
	
	
	private static boolean search(BSTNode root, int data){
	
		if(root == null){
			return false;
		}
		if(root.data == data)
			return true;
		if(data < root.data ){
			return search(root.left, data);
		}else{
			return search(root.right,data);
		}
	}

}
