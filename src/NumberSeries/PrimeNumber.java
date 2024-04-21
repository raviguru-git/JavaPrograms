package NumberSeries;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting Range:");
		int start = sc.nextInt();
		System.out.println("Enter the Ending Range:");
		int end= sc.nextInt();
		int sum = 0;
		for(int j=start; j<=end; j++)
		{
			int n = j; int count =0;
			
			for (int i=2;i<=n/2;i++ )
			{
				if (n%i==0) 
				{
					count++;
					break;
				}
			}
			if (count==0 && n!=1)
				sum+=n;
				//System.out.println(n);
				//System.out.println(n+ "It is a Prime Number");
			    //sum=sum + n;
				
				//if(n%10 ==3)
					//System.out.println(n);
				//System.out.println(n+ "It is a Prime Number");
			//else
			//	System.out.println(n+ "Is not a Prime Number");
			
		}
		System.out.println("Sum of the range prime nos is:"+sum);
	}

}
