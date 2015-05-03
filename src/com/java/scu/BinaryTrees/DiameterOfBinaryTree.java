package com.java.scu.BinaryTrees;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode root = BinaryTreeUtility.buildTree4();
		int diameter = getDiameter(root);
		System.out.println(diameter);
	}

	private static int getDiameter(BinaryTreeNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}
		int leftDia = 1+ getDiameter(root.left);
		int rightDia = 1+ getDiameter(root.right);
		
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		
		System.out.println("Left Dia: "+leftDia);
		System.out.println("right Dia "+rightDia);
		System.out.println("left height "+leftheight);
		System.out.println("rightHeight "+rightheight);
		return Math.max(Math.max(leftDia, rightDia), leftheight + rightheight + 1);
		
	}

private static int height(BinaryTreeNode root) {
		
		int leftHeight;
		int rightHeight;
		if(root == null){
			return 0;
		}
		
		leftHeight = height(root.left);
		rightHeight = height(root.right);
		
		if(leftHeight > rightHeight){
			return leftHeight+1;
		}else{
			return rightHeight+1;
					
		}
		
		
	}
}
