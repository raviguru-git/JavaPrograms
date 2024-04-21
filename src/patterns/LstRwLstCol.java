package patterns;

public class LstRwLstCol {
public static void main(String[] args) {
	int n = 9;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
			if(i==n-1 || j==n-1)    // if(i+j == n-1) for RHS Diagnol.
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
