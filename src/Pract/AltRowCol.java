package Pract;

public class AltRowCol {
	public static void main(String[] args) {
		char ch='A'; int b = 1; 
		int n=4;
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				if(j%2==0)
				{
					System.out.print(ch+++ " ");
				}
				else
				{
					System.out.print(b+++ " ");
				}
					
			}
			System.out.println();
		}
		
	}
	

}
