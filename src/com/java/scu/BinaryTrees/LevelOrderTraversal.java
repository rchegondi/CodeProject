package com.java.scu.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
	
	public static ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		//ArrayList<Integer> curr = null; 
		if(root==null){
			return res;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		
		while(!q.isEmpty()){
			
			BinaryTreeNode tmp = q.poll();  //null
			if(tmp!=null){
				ArrayList<Integer> curr = new ArrayList<Integer>();
				curr.add(tmp.data);
				if(tmp.getLeft()!=null){
				 q.offer(tmp.getLeft());	
				}
				if(tmp.getRight()!=null){
				 q.offer(tmp.getRight());	
	            }
            }else{
            	ArrayList<Integer> c_curr = new ArrayList<Integer>();
            	//c_curr.addAll(curr);
            	
            	res.add(c_curr);
            	//curr.clear();
            	if(!q.isEmpty()){
            		q.offer(null);
            	}
            	
            }
			
		}
		

		return res;
	}

	public static void main(String[] args) {
		BinaryTreeNode bTree1 = buildTree1();
		
		ArrayList<ArrayList<Integer>> output = levelOrder(bTree1);
		
		System.out.println(output);
		
		
BinaryTreeNode bTree3 = buildTree3();
		
		ArrayList<ArrayList<Integer>> output3 = levelOrder(bTree3);
		
		System.out.println(output3);

	}

	


}
