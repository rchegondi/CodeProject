package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfElements_BinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode btn3 = BinaryTreeUtility.buildTree3();
		//int data = 54;
		int height = heightOfBinTree(btn3);
		System.out.println(height);
	}

	private static int heightOfBinTree(BinaryTreeNode root) {
		int count = 0;
		if(root == null){
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			count++;
			
			if(temp.getLeft()!=null){
				q.offer(temp.getLeft());
			}
			if(temp.getRight()!=null){
				q.offer(temp.getRight());
			}
				
				
		}
		
		return count;
	}

}
