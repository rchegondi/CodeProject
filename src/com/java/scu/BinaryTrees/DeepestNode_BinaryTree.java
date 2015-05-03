package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

// The last node that is processed from Queue in level Order is the deepest node in the binary tree.
public class DeepestNode_BinaryTree {

	public static void main(String[] args) {

		BinaryTreeNode btn3 = BinaryTreeUtility.buildTree1();
		BinaryTreeNode deepestNode = getDeepestNode(btn3);
		System.out.println(deepestNode.getData());
		
	}

	private static BinaryTreeNode getDeepestNode(BinaryTreeNode root) {
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp = null;
		if(root == null){
			return null;
		}
		q.offer(root);
		while(!q.isEmpty()){
			temp = q.poll();
			if(temp.left!=null){
				q.offer(temp.left);
			}
			if(temp.right!=null){
				q.offer(temp.right);
			}
			
		}
		return temp;
		

	}

}
