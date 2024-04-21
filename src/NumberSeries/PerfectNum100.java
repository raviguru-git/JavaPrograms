package NumberSeries;

public class PerfectNum100 {
	public static void main(String[] args) {
		//int n=123;
		
		for(int j=1;j<=1000;j++)
		{
		int n=j; int sum=0;
		for (int i=1 ; i<=n/2;i++)
		{
			if (n%i==0)
			{
				sum= sum+i;
			}
		}
		if (sum==n)
			System.out.println(n+ " Is a perfect number");
		//else
			//System.out.println(n+ " Is not a perfect number");
		}
		
	}

}
