package Pract;

public class ArrayPrime {
	public static void main(String[] args) {
		int [] arr = {15,20,13,14,23,17};
		
		for (int i=0; i< arr.length; i++)
		{   int n = arr[i]; int count=0;
			for ( int j=n; j<=n/2; j++)
			{
				if ( n % j ==0 ) // for checking its prime or not here.
				{
					count++;
					break;
				}
			}
			if ( count == 0)
			{
				System.out.println(n + "is a prime number");
			}
			else 
				System.out.println(n + "is not a prime number");
		}
		
		
	}

}
