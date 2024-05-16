package Pract;

import java.util.Scanner;

public class NumReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to reverse it");
		int n = sc.nextInt();
		
		while(n>0)
		{
			 int res = n%10;  // After extracting it store it in a res container.
			 System.out.print(res);
			 n=n/10;
			
		}
		
		
	}

}
