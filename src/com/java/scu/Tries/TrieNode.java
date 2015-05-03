package com.java.scu.Tries;

import java.util.LinkedList;

public class TrieNode {

	char content;
	boolean isEnd;
	int count;
	LinkedList<TrieNode> childList;
	
	
	public TrieNode(char ch){
		childList = new LinkedList<TrieNode>();
		content = ch;
		count =0;
		isEnd = false;
	}
	
	public TrieNode subNode(char ch){
		if(childList !=null){
			for(TrieNode eachChild : childList){
				if(eachChild.content == ch){
					return eachChild;
				}else{
					return null;
				}
					
				
			}
		}
		return null;
	}
}
