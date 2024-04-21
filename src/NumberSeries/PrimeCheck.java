package NumberSeries;
import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value for Prime Number:");
		int start = sc.nextInt();
		System.out.println("Enter the ending value of Prme Number:");
		int end = sc.nextInt();
		
		for (int j=start ; j < end; j++)
		{
			int n = j; int count =0;
			for (int i = 2; i< n/2; i++)
			{
				if (n%i == 0)
				{
					count++;
					break;
				}
			}
			if (count == 0 && n%10!=1)
			{
				System.out.println(n);
				
			}
 			//else
//			{
			//	System.out.println("This is not a Prime number:" + n);
		//	}
		}
		
		
	}

}
