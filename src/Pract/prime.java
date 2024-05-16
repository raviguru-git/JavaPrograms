package Pract;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the nth number to find Prime number"); int n =
		 * sc.nextInt();
		 */		
		for (int j=1; j<100; j++)
		{
		int count = 0; int n = j;
		for ( int i=2; i<=n/2; i++ )
		{
			if (n % i == 0)
			{
				count++;
				break;
			}
		}
		if (count == 0 && n!=1 && n%10==3) System.out.println( n + " Is a prime number");
		//else System.out.println(n + " Is not a prime number");
		}
		
	}

}
