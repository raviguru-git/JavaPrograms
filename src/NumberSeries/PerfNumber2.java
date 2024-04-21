package NumberSeries;
import java.util.Scanner;

public class PerfNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int n=sc.nextInt();
		String res = isPerfect(n);
		System.out.println(res);
		
		
		
	}
	
	public static String isPerfect(int n)
	{
		int sum=0;
		for (int i=1; i<=n/2; i++)
		{
			if(n%i==0)  // In first iteration itself i=1 and n=3  6%1 = 0 get into loop.(bcz remainder
				// is zero, then i=2 and n is still 6, 6%2 =0, get into loop. 6%3=0,get into loop.
				// 6%3 =0, 
			{
				sum=sum+i;
			}
		}
		if (sum == n)
			return n+ "Is a perfect number";
		else
			return n+ "Is not a perfect number"; 
		}
	}
	
	


