package com.java.scu.Stacks;

class RemoveAdjacentDuplicates1{
	public int removeAdjacentDuplicates1(int[] A){
		int stkPtr = -1;
		int i=0;
		while(i<A.length){
			if(stkPtr==-1||A[stkPtr]!=A[i]){
				stkPtr++;
				A[stkPtr] = A[i];
			}else{
				while(i<A.length && A[stkPtr]==A[i]){
					
					i++;
				}
				stkPtr--;
		}
	}
		return stkPtr;
	
	
}
}

public  class TestRemoveadjacentDuplicates{

	public static void main(String[] args) {
 
		RemoveAdjacentDuplicates1 obj = new RemoveAdjacentDuplicates1();
		int[] A = {1,9,6,8,8,8,0,1,1,0,6,5};
		int index = obj.removeAdjacentDuplicates1(A);
		
		for(int j=0;j<index;j++){
			System.out.print(A[j]+" ");
		}
	}

}

