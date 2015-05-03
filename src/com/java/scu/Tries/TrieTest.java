package com.java.scu.Tries;

import java.util.Scanner;
//source : http://www.sanfoundry.com/java-program-implement-trie/
public class TrieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner scan = new Scanner(System.in);
		Trie t = new Trie();
		System.out.println("Trie Test\n");          
        char ch;
        do    
        {
            System.out.println("\nTrie Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter string element to insert");
                t.insert( scan.next() );                     
                break;                          
            case 2 : 
                System.out.println("Enter string element to delete");
                try
                {
                    t.remove( scan.next() ); 
                }                    
                catch (Exception e)
                {
                    System.out.println(e.getMessage()+" not found ");
                }
                break;                         
            case 3 : 
                System.out.println("Enter string element to search");
                System.out.println("Search result : "+ t.search( scan.next() ));
                break;                                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');     

	}

}
