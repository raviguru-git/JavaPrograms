package Pract;

public class Triang {
	public static void main(String[] args) {
		
		int n =4;
		
		for (int i=0; i< n; i++)
		{
			for (int j=0 ; j< n; j++)
			{
				if(i+j>=n-1)
				{
					System.out.print("* "); // Since it will consider as 2 characters,
				}                           // Below give as 2 spaces. 
				else
				{
					System.out.print("  "); // Give double space here.
				}
				
			}
			System.out.println();
		}
		
		
	}

}
