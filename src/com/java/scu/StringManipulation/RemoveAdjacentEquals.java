package com.java.scu.StringManipulation;

public class RemoveAdjacentEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "azxxzy";
		String out = removeDuplicate(s);
		System.out.println(out);
		System.out.println("The below output is from different code");
		String out2 = removeDuplicates(s);
		System.out.println(out2);
	    
	}
	
	public static String removeDuplicate(String s) {
	    StringBuilder builder = new StringBuilder();
	    char lastchar = '\0';
	    for (int i = 0; i < s.length(); i++) {
	        String str = builder.toString();
	        if (!str.equals("") && (str.charAt(str.length() - 1) == s.charAt(i))) {
	            builder.deleteCharAt(str.length() - 1);
	        } else if (s.charAt(i) != lastchar)
	            builder.append(s.charAt(i));
	        lastchar = s.charAt(i);
	    }
	    return builder.toString();
	}
	
	public static String removeDuplicates(String s) {
	    if (s.isEmpty()) {
	        return s;
	    }
	    char[] buf = s.toCharArray();
	    char lastchar = buf[0];

	    // i: index of input char
	    // o: index of output char
	    int o = 1;
	    for (int i = 1; i < buf.length; i++) {
	        if (o > 0 && buf[i] == buf[o - 1]) {
	            lastchar = buf[o - 1];
	            while (o > 0 && buf[o - 1] == lastchar) {
	                o--;
	            }
	        } else if (buf[i] == lastchar) {
	            // Don't copy to output
	        } else {
	            buf[o++] = buf[i];
	        }
	    }
	    return new String(buf, 0, o);
	}

}
