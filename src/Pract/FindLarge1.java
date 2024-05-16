package Pract;

public class FindLarge1 {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};

		int large = a[0];

		for (int i=0; i<a.length; i++ )
		{
			if (a[i] > large) large = a[i];
	}
		System.out.println(large);
		
		int [] b = {20,40,50,60,90};
		
		int small = a[0];
		
		for(int i=0; i< b.length; i++)
		{
			if (a[i] < small) small = a[i];
		}
		
		System.out.println(small);
	}
	
	



}
