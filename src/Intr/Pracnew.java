package Intr;

import java.util.Scanner;

public class Pracnew {
	public static void main(String[] args) {
	 int num =12345;
		 
		int sum = 0;
		while (num>0) {
			int res = num % 10;
			//sum = sum + res;
			System.out.print(res);
			num = num/10;
		}
		//System.out.println(sum);
		
		// Finding factorial of a number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n = sc.nextInt();
		int fact=1;
		for(int i =1 ; i<= n ; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
		
		
		
	}
	

	
	
	
	
	
	
}
