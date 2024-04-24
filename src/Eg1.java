
import java.util.Arrays;
import java.util.Scanner;

public class Eg1 {
public static void main(String[] args) {
	int[] arr = {10,20,15,5,30};
	
	// n will be largest.
	// i=0  length is 5;
	// i=0 length will 5-1
	Arrays.sort(arr);
	System.out.println(arr);
	for (int k=0; k<arr.length;k++)
	{
		System.out.print(arr[k] + " ");
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n from 1 to: " + arr.length);
	int n = sc.nextInt();
	System.out.println("The nth largest element is: " + arr[arr.length-n]);
 
	int first_largest = arr[0];
	
	for (int i=0; i<arr.length; i++) 
	{
		if (arr[i]>first_largest)
		{
			first_largest = arr[i];
		}
	}
	System.out.println(first_largest);

	
	
	/*
	 * for (int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
	 */
	
	
}
}
