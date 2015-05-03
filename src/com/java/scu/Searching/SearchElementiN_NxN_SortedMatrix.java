package com.java.scu.Searching;

public class SearchElementiN_NxN_SortedMatrix {

	public static void main(String[] args) {

		int matrix[][] = { 
				          {10, 20, 30, 40,50},
				          {15, 25, 35, 45,60},
				          {27, 29, 37, 48,70},
				          {32, 33, 39, 50,80},
						};
		
		int searchElement = 33;
		String position = getPositioninMatrix(matrix,searchElement);
		System.out.println(position);
		
	}

	private static String getPositioninMatrix(int[][] matrix, int searchElement) {
		
		int  data = searchElement;
		int rowCount = matrix.length;
		int colCount = matrix[0].length;
		int i=0,j=colCount-1;
		while(i<rowCount && j>=0){
			if(data == matrix[i][j]){
				return i+" row; "+j+" column";
			}
			if(data < matrix[i][j]){
				j--;
			}else{
				i++;
			}
		}
		
		
		return "No Such element in Matrix";
	}

}
