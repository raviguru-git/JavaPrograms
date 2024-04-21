package Arrays;

import java.util.Scanner;

public class FindArrayAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements or Size of the Array:");
		int n = sc.nextInt();
		double [] a = new double [n];
		System.out.println("Enter the Product prices to be stored in the Array");
		
		for (int i=0; i<a.length; i++)  // Reading the elements one by one here.
		{
			a[i]=sc.nextDouble();
		}
		//System.out.println("Entered elements are:");
		int sum =0;
		for (int i=0; i<a.length; i++)  // Printing the elements one by one here.
		{
			sum +=  a[i];
		}
		double average;
		average = sum / a.length;
		System.out.println(average);
		
				
	}

}
