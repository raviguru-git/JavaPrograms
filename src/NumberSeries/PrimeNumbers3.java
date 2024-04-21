package NumberSeries;
import java.util.Scanner;

public class PrimeNumbers3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the starting Range:");
			int start = sc.nextInt();
			System.out.println("Enter the Ending Range:");
			int end= sc.nextInt();
			int sum = 0; // Declare sum variable outside the outer for loop. Else sum
			// will get reset to zero inside the outer loop.
			for(int j=start; j<=end; j++)
			{
				int n = j; int count =0;
				
				for (int i=2;i<=n/2;i++ )//<n <=n-1
				{
					if (n%i==0)
					{
						count++;
						break;
					}
				}
				if (count==0 && n!=1)
				{
					sum=sum+n;
				}
				 
				
			}
			System.out.println(sum);
		}

	}



