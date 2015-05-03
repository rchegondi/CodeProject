package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfFullNodes_BinTree {

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeUtility.buildTree1();
		int fullNodeCount = getNumberOfFullNodes(root);
		System.out.println("Full node count "+fullNodeCount);
	}

	private static int getNumberOfFullNodes(BinaryTreeNode root) {
		int count =0;
		if(root== null)
			return 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp.left!=null && temp.right!=null){
				count++;
			}
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return count;
	}

}
