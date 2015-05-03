package com.java.scu.BinarySearchTrees;

public class SortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArray = {10,20,30,40,50,60,70,80,90,100,110};
		BSTNode newRoot =sortedArrToBST(sortedArray,0,sortedArray.length-1);
		
		boolean isNewRoot_aBST = IsBST.isBST(newRoot); 
		System.out.println("Sorted to BST check: "+isNewRoot_aBST);

	}

	private static BSTNode sortedArrToBST(int[] arr,int left, int right) {
		BSTNode  newNode = new BSTNode();
		if(left > right)
			return null;
		if(left == right){
			
			newNode.setData(arr[left]);
			newNode.setLeft(null);
			newNode.setRight(null);
		}else{
			int mid = left+(right-left)/2;
			newNode.setData(arr[mid]);
			newNode.setLeft(sortedArrToBST(arr,left,mid-1));
			newNode.setRight(sortedArrToBST(arr, mid+1, right));
			
		}
		return newNode;
		
	}

}
