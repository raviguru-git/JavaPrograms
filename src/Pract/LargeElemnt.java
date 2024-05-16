package Pract;

import java.util.Scanner;

public class LargeElemnt {
	public static void main(String[] args) {
		int [] arr = {10,600,30,5,6,70,80,200,40};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth value from 1 to" + arr.length);
		int n = sc.nextInt();
		
		for (int i=0; i<arr.length; i++) // To get one one element.
		{   int count=0;
			for (int j=0; j<arr.length; j++) // To compare 1st value with every other
											// element of the array.
			{
				if(arr[j] > arr[i])
				{
					count++;
				}
			}
			if (count == n-1) {System.out.println(arr[i]); break;}
		}
		
		
		
		
		
	}
	
	
	

}
