package com.java.scu.StringProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
/**
 * You will be provided with a Dictionary.
 * input: a Word
 * o/p:   return all anagrams associated with the input from dictionary.(String array)
 * @author ravichegondi
 *
 */
public class FindAnagramsFromDictionary {
	
	
	private  static ArrayList getAnagrams(String word){
		String[] dictionary = {"cat","act","pam","map","tap","pat","tac","tat","nose","osen","nosy","neso"};
		Hashtable<String,ArrayList<String>> hTable = new Hashtable<String,ArrayList<String>>();
		
		//create a key for each item in dictionary using sort. 
		//if the key presents in htable add current item to existing array list or create a new arraylist object
		for(int i=0; i<dictionary.length;i++){
			
			String sortedDictWord = sortString(dictionary[i]);//key
			ArrayList<String> anagramList = hTable.get(sortedDictWord);
			if(anagramList == null){
				anagramList = new ArrayList<String>();	
			}
			
			anagramList.add(dictionary[i]);
			hTable.put(sortedDictWord, anagramList);
			//Htable is setup. key is sorted value of item. value is list of anagrams
		}
		//get values for selected word.
		String selectedWord = sortString(word);//key
		if(hTable.containsKey(selectedWord)){
			
			return hTable.get(selectedWord);
		}
		
		return null;	
	}
	private static String sortString(String str){
		char[] str_char = str.toCharArray();
		Arrays.sort(str_char);
		return new String(str_char);
	}

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a word to find anagrams");
		String word = br.readLine();
		
		System.out.println(getAnagrams(word));
		
		
	}

}
