package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfLeafNodes {

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeUtility.buildTree2();
		int leafNodeCount = getNumberOfLeafNodes(root);
		System.out.println(leafNodeCount);
	}

	private static int getNumberOfLeafNodes(BinaryTreeNode root) {
		int count = 0;
		if(root == null){
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp.left == null && temp.right == null)
				count++;
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return count;
	}

}
