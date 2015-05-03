package com.java.scu.BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;


public class Solution {
    public static ArrayList<ArrayList<Integer>> levelOrderBottom(BinaryTreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        if(root==null) return result; 
        Stack<ArrayList<Integer>> stack=new Stack<ArrayList<Integer>>();
        ArrayList<BinaryTreeNode> list=new ArrayList<BinaryTreeNode>();
        list.add(root);
        while(!list.isEmpty())
        {
            ArrayList<BinaryTreeNode> Tplist=new ArrayList<BinaryTreeNode>();
            ArrayList<Integer> level=new ArrayList<Integer>();
            while(!list.isEmpty())
            {
                BinaryTreeNode node=list.remove(0);
                level.add(node.data);
                if(node.left!=null) Tplist.add(node.left);
                if(node.right!=null) Tplist.add(node.right);
            }
            stack.push(level);
            list=Tplist; 
        }
        while(!stack.isEmpty())
        {
            result.add(stack.pop());
        }
        return result; 
    }
    
    public static void main(String[] args){
    	BinaryTreeNode bTree1 = buildTree1();
		BinaryTreeNode bTree2 = buildTree2();
		
		ArrayList<ArrayList<Integer>> result = levelOrderBottom(bTree1);
		
		System.out.println(result);
    	
    }
    
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
    
}