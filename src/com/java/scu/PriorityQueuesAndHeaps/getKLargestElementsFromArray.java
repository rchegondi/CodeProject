package com.java.scu.PriorityQueuesAndHeaps;

public class getKLargestElementsFromArray {

	public static void main(String[] args) {

		int[] array = {60,40,50,10,45,10,39,76,48,91}; // 91,76,60
		Maxheap mHeap = UtilityClass.buildHeap(array);
		int k =3;
		for(int i=0;i<3;i++){
			System.out.println(mHeap.deleteMax()+",");
		}
		
	}

}
