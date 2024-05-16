package Pract;

import java.util.Scanner;

public class NthSmallest {
	public static void main(String[] args) {
		int [] a = {30,40,10,50,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value from 1 to ==>:"+ a.length);
		int n = sc.nextInt();
		for (int i=0; i<a.length; i++)
		{
			int count=0;
			for (int j=0; j<a.length; j++)
			{
				if ( a[j] < a[i]) 
					{
					 count++;			 
					 
					}
					//System.out.println(count);
			}
			//System.out.println(count);
			if (count == n-1) {System.out.println(a[i]);
			break;
			}
		}
		
		
		
	

}
}
