package NumberSeries;

public class SquareRoot {
	public static void main(String[] args) {
		
		int n = 81;
		int count = 0;
		int i=1;
		for (;i<=n/2;i++)
		{
			if(i * i == n)
			{
			count++;
			break;
			}
		}
		if (count == 1)
			System.out.println(i+ "  is the Square root of the number:" + n);
		else
			System.out.println(i+ "is not the Square root of: " + n);
			
		
		
	}

}
