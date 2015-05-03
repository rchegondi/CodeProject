package com.java.scu.BinaryTrees;

/**
 * Method 1: get Max from left subtree and max from right subtree
 * 
 * @author ravichegondi
 *
 */
public class MaxElement_BinaryTree {

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
	
	public static BinaryTreeNode buildTree3() {
		
		BinaryTreeNode root = new BinaryTreeNode(1); //root
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		root.left.right=new BinaryTreeNode(5);
		root.right.left=new BinaryTreeNode(6);
		root.right.right=new BinaryTreeNode(7);
		
		root.left.left.left=new BinaryTreeNode(8);
		root.left.right.left=new BinaryTreeNode(9);
		root.left.right.left.left=new BinaryTreeNode(9);
		root.left.right.left.right=new BinaryTreeNode(9);
		
		root.right.right.right=new BinaryTreeNode(12);
		root.right.right.right.left=new BinaryTreeNode(13);
		root.right.right.right.right=new BinaryTreeNode(14);
		
		root.right.right.right.right.left=new BinaryTreeNode(15);
		root.right.right.right.right.left.right=new BinaryTreeNode(16);

		return root;
		
	}
	private static int getMaxInBinTree(BinaryTreeNode root) {
		int max_value = Integer.MIN_VALUE;
		if(root!=null){
			int leftMax = getMaxInBinTree(root.left);
			int rightMax = getMaxInBinTree(root.right);
			if(leftMax > rightMax){
				max_value = leftMax;
			}else{
				max_value = rightMax;
			}
			if(root.data > max_value){
				max_value = root.data;
			}
		}
		
		return max_value;
	}
	
	public static void main(String[] args) {

		BinaryTreeNode bTree1 = buildTree1();
		BinaryTreeNode bTree2 = buildTree2();
		BinaryTreeNode bTree3 = buildTree3();

		int max1 = getMaxInBinTree(bTree1);
		
		System.out.println("Max in Binary Tree 1 is  : "+max1);

		int max2 = getMaxInBinTree(bTree2);
		
		System.out.println("Max in Binary Tree 2 is  : "+max2);
		
        int max3 = getMaxInBinTree(bTree3);
		
		System.out.println("Max in Binary Tree 3 is  : "+max3);
	}

	

	

}
