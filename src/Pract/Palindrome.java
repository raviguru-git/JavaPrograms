package Pract;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	//String s = "racecar";
	String rev ="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string to check palindrome");
	String s = sc.nextLine();
	
	for (int i= s.length()-1; i>=0; i--)
	{
		rev = rev + s.charAt(i);
	}
	
	if (s.equalsIgnoreCase(rev)) System.out.println("String is Palindrome");
	else System.out.println("String is not a Palindrome");
	
	
}
	
	
}
