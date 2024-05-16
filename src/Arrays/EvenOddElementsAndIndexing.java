package Arrays;

import java.util.Arrays;

public class EvenOddElementsAndIndexing {
	public static void main(String[] args) {
		int [] a = {10,25,30,15,5,80};
		
		
		for (int i=0; i<a.length;i++)
		{
			if(!(a[i]%2==1))  // if(a[i]%2 ==0) / Even no. // if(!a[i]%2==0) Odd number./
				// For Even index -> i%2==0 and for // For Odd index -> i%2!=0.
			{
			System.out.println(a[i]);
			}
		}
		System.out.println("*********************");
		for (int i =0; i<a.length; i++)  // This is for finding the index which are even.
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("*********************"); // This is for finding the index which are odd.
		for (int i=0; i< a.length; i++)
		{
			if(i%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
