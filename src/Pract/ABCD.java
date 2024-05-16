package Pract;

public class ABCD {
	
	public static void main(String[] args) {
		 int n=4;
		 char ch='A'; //If every row value is changing then initialization should be done
		 			  // in outside first for loop.
		for(int i=0;i<n;  i++)
		{   
			for (int j=0; j<n; j++)
			{
			System.out.print(ch + " ");
			//ch++;
			}
			System.out.println();
			ch++;
		}
		System.out.println();
		
		int n1=3; 
		for (int i=0; i<n1; i++)
		{   int b=1;  // If initialized above the second for loop then
					  // it will have same values for all the rows.
			for (int j=0; j<n1; j++)
			{
				System.out.print(b + " ");
				b++;
			}
			System.out.println();
		}
		
	}
	
	

}
