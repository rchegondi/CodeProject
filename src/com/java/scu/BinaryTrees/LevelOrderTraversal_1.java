package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal_1 {

	public static void main(String[] args) {

		BinaryTreeNode btn1 = BinaryTreeUtility.buildTree1();
		Stack<BinaryTreeNode> output = levelOrder1(btn1);
		while(!output.isEmpty()){
			System.out.print(output.pop().getData()+" ");	
		}
		System.out.println();
		
		BinaryTreeNode btn3 = BinaryTreeUtility.buildTree3();
		Stack<BinaryTreeNode> output3 = levelOrder1(btn3);
		while(!output3.isEmpty()){
			System.out.print(output3.pop().getData()+" ");	
		}
		
	}

	private static Stack<BinaryTreeNode> levelOrder1(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		if(root==null){
			return stack;
		}
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp.getLeft()!=null){
				q.offer(temp.left);
			}
			if(temp.getRight()!=null){
				q.offer(temp.right);
			}
			stack.push(temp);
		}
		
		return stack;
		
		
	}
	

}
