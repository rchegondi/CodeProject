package com.java.scu.BinaryTrees;

public class LowestCommonAncestor {

	public static void main(String[] args) {

		BinaryTreeNode btn1 = BinaryTreeUtility.buildTree4();
		BinaryTreeNode p = new BinaryTreeNode(6);
		BinaryTreeNode q = new BinaryTreeNode(7);
		BinaryTreeNode ancestor = lowestCommonAncestor(btn1,p,q);
		if(ancestor!=null)
		System.out.println(ancestor.getData());
		else
			System.out.println("Error");
		
	}

	private static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root,
			BinaryTreeNode p, BinaryTreeNode q) {
		if(root == null)
			return null;
		if(root.data == p.data || root.data == q.data)
			return root;
		BinaryTreeNode left = lowestCommonAncestor(root.left, p, q);
		BinaryTreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left!=null && right !=null){
			return root;
		}
		else
			return(left!=null?left:right);
		
		//return root;
	}

}
