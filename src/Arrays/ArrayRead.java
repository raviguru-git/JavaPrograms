package Arrays;

import java.util.Scanner;

public class ArrayRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		int [] a = new int [n];
		for (int i =0; i< a.length; i++) // Storing the elements one by one.
		{
			a[i] = sc.nextInt();
			System.out.println(a[i]);
		}
		for (int i=0; i<a.length; i++) // Print the elements one by one here.
		{
			System.out.println(a[i]);
		}
		
		
	}

}
