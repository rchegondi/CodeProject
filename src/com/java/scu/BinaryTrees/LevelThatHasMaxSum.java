package com.java.scu.BinaryTrees;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class LevelThatHasMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtility.buildTree1();
		getMaxSumLevel(root);

	}
	private static void getMaxSumLevel(BinaryTreeNode root){

		if(root == null){
			System.out.println("No tree");
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		//System.out.println(q.size());
		//int maxSum = 0;
	    int currentSum = 0;
		int currentLevel =0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		//map.put(currentLevel, root.data);
		
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			//System.out.println(temp.data);
			if(temp!=null){
				currentSum = currentSum+ temp.data;
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}else{
				
				map.put(currentLevel++, currentSum);
				currentSum = 0;
				if(!q.isEmpty())
				  q.offer(null);
			}
			
		}
		Iterator itr = map.entrySet().iterator();
		Map.Entry<Integer,Integer> entry;
		int maxSum1 = 0;
		int level = -1;
		while(itr.hasNext()){
			entry = (Entry<Integer, Integer>) itr.next();
			if(entry.getValue() >= maxSum1){
				maxSum1 = entry.getValue();
				level = entry.getKey();
			}
			System.out.println("Level "+level+" value "+maxSum1);
		}
		System.out.println("Max Sum is in Level "+level+" with Sum "+maxSum1);
	}

}
