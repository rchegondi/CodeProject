package com.java.scu.BinaryTrees;

public class GenerateBinartTreeFrom_IN_PREOrder {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inOrder= {4,2,5,1,6,3,7};
		int[] preOrder = {1,2,4,5,3,6,7};
		
		//construct a BT using Inorder(LDR) and Preorder(DLR)
		// So left most in Pre Order is the root
		
		BinaryTreeNode root = buildBinaryTree(inOrder, preOrder);
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		
		

	}

	private static BinaryTreeNode buildBinaryTree(int[] in,
			int[] pre) {
		if(in.length!=pre.length|| (in.length==0 || pre.length==0)){
		return null;	
		}
		
		return BuildBT(pre,0,pre.length-1,in,0,in.length-1);
	}

	private static BinaryTreeNode BuildBT(int[] pre, int preStrt, int preEnd, int[] in,
			int inStrt, int inEnd) {
		if(preStrt > preEnd || inStrt > inEnd){
			return null;
		}
		//get 1st node or root
		int  data = pre[preStrt];
		BinaryTreeNode curr = new BinaryTreeNode(data);
		int offset = inStrt;
		for(;offset<inEnd;offset++){
			if(in[offset] == data)
				break; // we got the offset position so come out
		}
		
		curr.left = BuildBT(pre, preStrt+1, preStrt+offset-inStrt, in, inStrt,offset-1);
		curr.right = BuildBT(pre,preStrt+offset-inStrt+1,preEnd,in, offset+1,inEnd);
		
		return curr;
	}

}
