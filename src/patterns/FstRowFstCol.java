package patterns;

public class FstRowFstCol {
	public static void main(String[] args) {
		int n = 9;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || j==0)    // if(i+j == n-1) for RHS Diagnol.
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
