package QuickCheck;

public class ABCD1234 {
	
	public static void main(String[] args) {
		int n =4; char ch ='A' ; int a =1;
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				if (j %2 == 0)
				{
					System.out.print(ch+++ " ");
				}
				else
				{
					System.out.print(a++ + " ");
				}
				
			}
			System.out.println();
		}
	}

}
