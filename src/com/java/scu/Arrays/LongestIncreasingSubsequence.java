package com.java.scu.Arrays;

public class LongestIncreasingSubsequence {


    public int longestSubsequenceWithActualSolution(int arr[]){
        
        int temp[] = new int[arr.length];
        int actualSolution[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            temp[i] = 1;
            actualSolution[i] = i;
        }
        for(int i=0; i<temp.length;i++){
        	System.out.print(temp[i]+":");
        }
        System.out.println();
        
        for(int i=0; i<actualSolution.length;i++){
        	System.out.print(actualSolution[i]+":");
        }
        System.out.println();
        for(int i=1; i < arr.length; i++){
            for(int j=0; j < i; j++){
                if(arr[i] > arr[j]){
                    if(temp[j] + 1 > temp[i]){
                        temp[i] = temp[j] + 1;
                        //set the actualSolution to point to guy before me
                        actualSolution[i] = j;
                    }
                }
            }
        }
        for(int i=0; i<temp.length;i++){
        	System.out.print(temp[i]+":");
        }
        System.out.println();
        for(int i=0; i<actualSolution.length;i++){
        	System.out.print(actualSolution[i]+":");
        }
        System.out.println();
        int maxIndex = 0;
        for(int i=0; i < temp.length; i++){
            if(temp[i] > temp[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println("MaxIndex of Temp "+maxIndex);
        //lets print the actual solution
        int t = maxIndex;
        int newT = maxIndex;
        do{
            t = newT;
            System.out.print(arr[t] + " ");
            newT = actualSolution[t];
        }while(t != newT);
        System.out.println();
 
        return temp[maxIndex];
    }
    /*
    private int longestSubsequenceRecursive(int arr[], int pos, int lastNum){
        if(pos == arr.length){
            return 0;
        }
        int t1 = 0;
        if(arr[pos] > lastNum){
            t1 = 1 + longestSubsequenceRecursive(arr, pos+1, arr[pos]);
        }
        int t2 = longestSubsequenceRecursive(arr, pos+1, lastNum);
        return Math.max(t1, t2);
    }
    
    public int longestSubsequenceRecursive(int arr[]){
        int maxLen = 0;
        for(int i=0; i < arr.length-1; i++){
            int len = longestSubsequenceRecursive(arr,i+1,arr[i]);
            if(len > maxLen){
                maxLen = len;
            }
        }
        return maxLen + 1;
    }
  */  
    public static void main(String args[]){
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int result = lis.longestSubsequenceWithActualSolution(arr);
        //int result1 = lis.longestSubsequenceRecursive(arr);
       System.out.println(result);
        //System.out.println(result1);
    }
}
