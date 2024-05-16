package Pract;

import java.util.Scanner;

public class Eg {
public static void main(String[] args) {
	/*
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("Please enter the string to Check for Palindrome");
	 */
	String s= "ravi";
   // String s = sc.nextLine();
    String rev ="";
    for(int i=s.length()-1;i>=0; i--)
    {
    	 rev = rev +s.charAt(i);
    }
    
   if (s.equals(rev)) System.out.println("String is Palindrome");
   else System.out.println("String is not a Palindrome");
    
   
	
	
}
}
