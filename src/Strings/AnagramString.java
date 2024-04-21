 package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings to check Anagram or not");
		String s1 = sc.next();
		String s2 = sc.next();
		char [] ch = s1.toCharArray();
		char [] ch1 = s2.toCharArray();
	    Arrays.sort(ch);
	    Arrays.sort(ch1);
	    boolean res = Arrays.equals(ch, ch1);
	    if(res)
	    	System.out.println("Entered two Strings are Anagram");
	    else
	    	System.out.println("Entered two Strings are not Anagram");
	}

}

