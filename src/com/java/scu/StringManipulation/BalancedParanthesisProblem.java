package com.java.scu.StringManipulation;

public class BalancedParanthesisProblem {

	public static void main(String[] args) {
System.out.println(nestedParenthesisDepth("abc(123(xyz))m(((n)))o"));
		//System.out.println(nestedParenthesisDepth(")()("));
//	System.out.println(nestedParenthesisDepth("()()()()("));
		//System.out.println(nestedParenthesisDepth("((()))()()"));
		//System.out.println(nestedParenthesisDepth("()()()()))"));
		//System.out.println(nestedParenthesisDepth("(("));
		
		
	}
    
	public static int nestedParenthesisDepth(String input)
            throws IllegalArgumentException {
    	int maxcount = 0;
        int par_count = 0;
    	
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '('){
            	par_count++;
            	if(par_count > maxcount){
            		maxcount = par_count;
            	}
            }else if(input.charAt(i) == ')'){
            	if(par_count > 0){
            		par_count--;
            	}else{
                	throw new IllegalArgumentException();
                }
            }
        }
        if(par_count!=0){
        	throw new IllegalArgumentException();
        }else{
        	System.out.println("Balanced");
        }
        return maxcount;
    }

}
