package Arrays;

import java.util.Scanner;

public class SmallstWithoutSort {
	
	public static void main(String[] args) {
		
		int [] a = {25,30,10,50,40,15};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element n value from 1  to:" + a.length);
		int n = s.nextInt();
		
		for (int i = 0; i< a.length; i++) // To get one element from the array.
		{
			int count = 0;
			for ( int j=0 ; j<a.length; j++) // To compare with every element.
			{
				if (a[j] < a[i])
				{
					count ++;
				}
			}
			if ( count == n-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
	

}
