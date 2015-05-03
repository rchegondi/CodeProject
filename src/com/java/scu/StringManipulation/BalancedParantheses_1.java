package com.java.scu.StringManipulation;

import java.util.Stack;

// USING STACK
public class BalancedParantheses_1 {

	public static void main(String[] args) {
		
		String str1 = "[()]{}{[()()]()}";
		String str2 = "[(])";
		String str3 = "(a+b*(c-d)-(e-f/(g+h*(k-i)/(l-j+k";
		String str4 = "((a+)b)";
		
		System.out.println("Str1 is balanced or not:"+isBalanced(str1));
		System.out.println("Str2 is balanced or not:"+isBalanced(str2));
		System.out.println("Str3 is balanced or not:"+isBalanced(str3));
		System.out.println("Str4 is balanced or not:"+isBalanced(str4));




	}

	private static boolean isBalanced(String str) {
		Stack<Character> stk = new Stack<Character>();
		char[] strChar = str.toCharArray();
		for(int i=0;i<strChar.length;i++){
			
			if(strChar[i]=='[' || strChar[i]=='{' ||strChar[i]=='('){
				stk.push(strChar[i]);
			}else if(strChar[i] == ']'){
				if(stk.isEmpty())       return false;
				if(stk.pop()!='['){//peek() also works here
					return false;
				}
			}else if(strChar[i] == '}'){
				if(stk.isEmpty())       return false;

				if(stk.pop()!='{'){
					return false;
				}
			}else if(strChar[i] == ')'){
				if(stk.isEmpty())       return false;

				if(stk.pop()!='('){
					return false;
				}
			}
		}
		return stk.isEmpty();
		
		
	}

}
