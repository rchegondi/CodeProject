package com.java.scu.BinaryTrees;

public class SearchElement_BinaryTree {
	

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

	private static BinaryTreeNode buildTree2() {
		
		BinaryTreeNode root = new BinaryTreeNode(4); //root
		root.left=new BinaryTreeNode(6);
		root.right=new BinaryTreeNode(2);
		root.left.left=new BinaryTreeNode(14);
		root.left.right=new BinaryTreeNode(54);
		root.right.left=new BinaryTreeNode(33);
		root.right.right=new BinaryTreeNode(16);
		return root;
		
	}
	
	private static boolean searchInBT(BinaryTreeNode root, int searchElement) {
		if(root==null){
        return false;
        }
		if(root.getData() == searchElement){
			return true;
		}
		
		return searchInBT(root.left,searchElement) || searchInBT(root.right,searchElement);
		
	}

	public static void main(String[] args) {

		BinaryTreeNode bTree1 = buildTree1();
		BinaryTreeNode bTree2 = buildTree2();
		
		int searchElement = 330;
		boolean searchResult = searchInBT(bTree2,searchElement);
		System.out.println(searchResult);
	}

	

}
