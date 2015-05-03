package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SizeofBinaryTree {
	

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
	
	private static int getSizeOfBinaryTree(BinaryTreeNode root) {
		
		int count = 0;
		if(root == null){
			return 0;
		}
		//use levelorder
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			count++;
			if(temp.left !=null){
				q.offer(temp.left);
			}
			if(temp.right != null){
				q.offer(temp.right);
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		BinaryTreeNode bTree1 = buildTree1();
		BinaryTreeNode bTree2 = buildTree2();
		
		int size1 = getSizeOfBinaryTree(bTree1);
		int size2 = getSizeOfBinaryTree(bTree2);
		
		System.out.println(size1);
		System.out.println(size2);

		
		
	}

	

}
