package Strings;

import java.util.Scanner;

public class PalindromeStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome is String");
			
		}
		else
			System.out.println("Not a Palindrome String");
	}

}
