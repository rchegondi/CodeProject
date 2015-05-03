package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree_Iterative {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = buildTree();
		int height = getBinaryTreeHeight(root);
		System.out.println("if only one node height is 1");
		if(height!=-1)
		   System.out.println("Height of tree is "+height);
		else
			System.out.println("No Tree");
		
		int minDepth = getMinDepth(root);
		if(minDepth !=-1){
			System.out.println("Min height "+minDepth);
		}
		
			

	}
	
	

	private static int getBinaryTreeHeight(BinaryTreeNode root) {
		int height = 0;
		if(root == null){
			return height;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int currentLevelNodeCount = 1;
		int nextLevelNodeCount = 0;
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			currentLevelNodeCount--;
			if(temp.left!=null){
				q.offer(temp.left);
				nextLevelNodeCount++;
			}
			if(temp.right !=null){
				q.offer(temp.right);
				nextLevelNodeCount++;
			}
			if(currentLevelNodeCount == 0){
				height++;
				currentLevelNodeCount = nextLevelNodeCount;
				nextLevelNodeCount = 0;
			}
		}
		
		
		return height;
	}
	
	
	private static int getMinDepth(BinaryTreeNode root) {
		if(root == null)
			return 0;
		if(root.left == null)
			return 1+ getMinDepth(root.right);
		if(root.right == null)
			return 1+getMinDepth(root.left);
		return 1+Math.min(getMinDepth(root.left), getMinDepth(root.right));
	}

	public static BinaryTreeNode buildTree() {
		
		BinaryTreeNode root = new BinaryTreeNode(1); //root
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		root.left.right=new BinaryTreeNode(5);
		root.right.left=new BinaryTreeNode(6);
		root.right.right=new BinaryTreeNode(7);
		
		root.left.left.left=new BinaryTreeNode(8);
		root.left.right.left=new BinaryTreeNode(9);
		root.left.right.left.left=new BinaryTreeNode(10);
		root.left.right.left.right=new BinaryTreeNode(11);
		
		root.right.right.right=new BinaryTreeNode(12);
		root.right.right.right.left=new BinaryTreeNode(13);
		root.right.right.right.right=new BinaryTreeNode(14);
		
		root.right.right.right.right.left=new BinaryTreeNode(15);
		root.right.right.right.right.left.right=new BinaryTreeNode(16);

		return root;
		
	}

}
