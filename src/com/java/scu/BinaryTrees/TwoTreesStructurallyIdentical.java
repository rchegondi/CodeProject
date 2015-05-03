package com.java.scu.BinaryTrees;

public class TwoTreesStructurallyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root1 = BinaryTreeUtility.buildTree1();
		BinaryTreeNode root2 = BinaryTreeUtility.buildTree2();
		BinaryTreeNode root3 = BinaryTreeUtility.buildTree3();

		System.out.println("Check for Strcture only");
		boolean isStructurallyIdentical1 = isStructurallyIdentical(root1,root2);
		System.out.println("isStructurallyIdentical 1&2 "+isStructurallyIdentical1);
		
		boolean isStructurallyIdentical2 = isStructurallyIdentical(root1,root3);
		System.out.println("isStructurallyIdentical 1&3 "+isStructurallyIdentical2);

		System.out.println("---------------------------");
		
		System.out.println("Check for idetical ");
		boolean isIdentical1 = isIdentical(root1,root1);
		System.out.println("isIdentical 1&2 "+isIdentical1);
		
		boolean isIdentical2 = isIdentical(root1,root3);
		System.out.println("isIdentical 1&3 "+isIdentical2);

	}

	private static boolean isStructurallyIdentical(BinaryTreeNode root1,
			BinaryTreeNode root2) {
		if(root1 == null && root2==null)
			return true;
		if((root1 != null && root2==null) || (root1 == null && root2!=null))
			return false;
		return (isStructurallyIdentical(root1.left,root2.left) && isStructurallyIdentical(root1.right,root2.right));
		
		//return false;
	}
	
	private static boolean isIdentical(BinaryTreeNode root1,
			BinaryTreeNode root2){
		if(root1==null && root2 == null)
			return true;
		if((root1 != null && root2==null) || (root1 == null && root2!=null))
			return false;
		if(root1.data != root2.data)
			return false;
		return(isIdentical(root1.left,root2.left) && isIdentical(root1.right, root2.right));
		
	}

}
