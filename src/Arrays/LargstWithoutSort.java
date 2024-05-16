package Arrays;

import java.util.Scanner;

public class LargstWithoutSort {
	public static void main(String[] args) {
		
		int [] a = {25,30,10,50,40,15};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value from 1 to" + a.length);
		int n = s.nextInt();
		for (int i =0; i < a.length; i++) // To get one element from the array.
		{
			int count =0;
			for (int j=0 ; j< a.length; j++) // To do comparison with every element.
			{                                // Compare with i keeping i constant.
				if (a [j] > a[i])            // i.e. a[j] > a[i].
				{
					count ++;
				}
			}
			if (count == n-1)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}

}
