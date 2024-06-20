package Intr;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter two Strings");
	     String s1 =  sc.nextLine();
	     String s2 = sc.nextLine();
	     s1 = s1.toLowerCase();
	     s2 = s2.toLowerCase();
	    char [] ch1 =  s1.toCharArray();
	    char [] ch2 = s2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	  boolean  res = Arrays.equals(ch1,ch2);
	  if (res)
	  {
	    System.out.println("Two Strings are Anagram:");
	  }
	  else
	  {
	     System.out.println("Two Strings are not Anagram:");
	  }
	     
		
		
		
	}
		
	}


