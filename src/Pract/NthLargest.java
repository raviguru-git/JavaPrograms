package Pract;

import java.util.Scanner;

public class NthLargest {
	public static void main(String[] args) {
		int [] a = {20,800,40,60,90,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value from 1 to" + a.length);
		int n= sc.nextInt();
		
		for (int i=0; i< a.length; i++) // getting each element.
		{   int count=0;
			for (int j=0; j< a.length; j++ ) // comparing with j 
			{
				if(a[j] > a[i]) count++;  // comparing a[j] with a[i]
			}
			if (count == n-1)
			{
				System.out.println(n + " Largest element is:"+ a[i]);
				break;
			}
		}
		
		
		
		
		
	}

}
