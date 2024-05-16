package Pract;

public class PerfNum {
	public static void main(String[] args) {
		// PN : Sum of factors of it and excluding that no itself.
		
		//int n= 6;
		
		
		
		for (int j=1; j<100; j++)
		{
			int n =j; int temp = n;
			int sum = 0;
		
		for (int i=1 ; i<=n/2; i++)
		{
			if (n % i == 0)  // If its a factor then add it to sum inside loop.
			{
				sum = sum + i;
			
			}
		}
		if (sum == n) System.out.println(n + " is a perfect number");
		//else System.out.println(n + " is not a perfect number");
		}
		
		
		
		
	}

}
