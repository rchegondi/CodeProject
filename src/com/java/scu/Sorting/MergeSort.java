package com.java.scu.Sorting;

public class MergeSort {

	public static void main(String[] args) {
 
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("--------------------");

		for(int j=0;j<=arr.length-1;j++){
			System.out.print(arr[j]+" ");
			
		}
		System.out.println();
		System.out.println("--------------------");
		
		int[] sortedArray = mergeSort(arr);
		
		for(int j=0;j<=sortedArray.length-1;j++){
			System.out.print(sortedArray[j]+" ");
			
		}
	}

	private static int[] mergeSort(int[] A) {
		int len = A.length;
		if(len <= 1){
			return A;
		}else{
			int len1 = len/2;
			int len2 = len-len1;
			int[] first = new int[len1];
			int[] second = new int[len2];
			
			for(int i=0;i<len;i++){
				if(i<len1){
					first[i]=A[i];
				}else{
					second[i-len1]=A[i];
				}
			}
			
			first = mergeSort(first);
			second = mergeSort(second);
			
			
			merge(first,second,A);
			
			return A;
			
		}
		
		
		
	}

	private static void merge(int[] first, int[] second, int[] result) {
		// Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
        
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                j++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
                j++;
            }
           
        }
        while(first.length!=iFirst){
        	result[j]=first[iFirst];
        	j++;
        	iFirst++;
        }
        while(second.length!=iSecond){
        	result[j]=second[iSecond];
        	j++;
        	iSecond++;
        }
        
	}

}
