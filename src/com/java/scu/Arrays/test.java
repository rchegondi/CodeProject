package com.java.scu.Arrays;

public class test {

	public static void main(String[] args) {

		int[] array = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
		int[] result = lis(array);
	}

	private static int[] lis(int[] array) {
		int[] temp = new int[array.length];
		int[] actualSol = new int[array.length];
		
		for(int i=0;i<temp.length;i++){
			temp[i] = 1;
			actualSol[i] =i;
		}
		////////
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+",");
		}
		System.out.println();
		for(int i=0;i<actualSol.length;i++){
			System.out.print(actualSol[i]+",");
		}
		System.out.println();
		/////////
		for(int i=1;i<array.length;i++){
			
			for(int j=0;j<i;j++){
				if(array[j] < array[i]){
					if(temp[j]+1 > temp[i]){
						temp[i] = temp[j]+1;
						actualSol[i] = j;
					}
				}
			}
		}
	    ////////
			for(int i=0;i<temp.length;i++){
				System.out.print(temp[i]+",");
			}
			System.out.println();
			for(int i=0;i<actualSol.length;i++){
				System.out.print(actualSol[i]+",");
			}
			System.out.println();
		/////////
		
		//get MaxIndex of Temp
			int maxIndex = 0;
			for(int i=1;i<temp.length;i++){
				if(temp[i] > temp[maxIndex]){
					maxIndex = i;
				}
			}
		System.out.println("MaxIndex in Temp: "+maxIndex);
		
		int t = maxIndex;
		int newT = maxIndex;
		
		do{
			t = newT;
			System.out.print(array[t]+",");
			newT = actualSol[t];
			
			
			
		}while(t!=newT);
		
		
		return actualSol;
	}

}
