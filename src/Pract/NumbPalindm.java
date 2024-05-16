package Pract;

import java.util.Scanner;

public class NumbPalindm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check for Palindrome");
		int n = sc.nextInt();
		int rev =0;
		int temp = n;
		while(n>0)
		{
			int rem = n%10;  
			rev = rev * 10 + rem;
			n=n/10;
		}
		if (temp == rev)
		{
			System.out.println(temp + "is a palindrome number");
		}
		else
		{
			System.out.println(temp + "is not a palindrome number");
		}
		
	}

}
