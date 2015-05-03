package com.java.scu.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Search_BinTree_withoutRecursion {

	public static void main(String[] args) {

		BinaryTreeNode btn2 = BinaryTreeUtility.buildTree2();
		int data = 54;
		boolean search_result = searchWORecursion(btn2,data);
		System.out.println(search_result);
		
	}

	private static boolean searchWORecursion(BinaryTreeNode root,int data) {
		
		if(root==null){
			return false;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp!=null){
				if(temp.getData()== data){
					return true;
				}
				if(temp.getLeft() != null){
					q.offer(temp.getLeft());
				}
				if(temp.getRight()!=null){
					q.offer(temp.getRight());
				}
			}
		}
		
			
			return false;
	}

}
