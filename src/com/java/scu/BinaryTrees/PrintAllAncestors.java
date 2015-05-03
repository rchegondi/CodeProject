package com.java.scu.BinaryTrees;

import java.util.Stack;


/**
 * use two stacks.
 * 
 * @author ravichegondi
 *
 */
public class PrintAllAncestors {

	public static void main(String[] args) {		
		int node = 5;				
		BinaryTreeNode btn3 = BinaryTreeUtility.buildTree1();
		printAllAncestors(btn3,node);
	}

	private static void printAllAncestors(BinaryTreeNode root,int node) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> list = new Stack<BinaryTreeNode>();
		
		stack.push(root);
		list.push(root);
		
		while(!stack.isEmpty()){
			BinaryTreeNode temp = stack.pop();
			if(temp.getData() == node){
				stack.clear();
				stack.push(temp);
				while(!list.isEmpty()){
					BinaryTreeNode k = stack.peek();
					if(list.peek().getLeft() == k || list.peek().getRight()== k){
						stack.push(list.pop());
					}else{
						list.pop();
					}
				}
				while(!stack.isEmpty()){
					System.out.print(stack.pop().getData()+" ");
				}
				
			}else{
				if(temp.getLeft() !=null){
					stack.push(temp.getLeft());
					list.push(temp.getLeft());
				}
				if(temp.getRight() !=null){
					stack.push(temp.getRight());
					list.push(temp.getRight());
				}
			}
		}
		

	}
}
