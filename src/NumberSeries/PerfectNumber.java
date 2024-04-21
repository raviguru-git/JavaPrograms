package NumberSeries;
import java.util.Scanner;

public class PerfectNumber {
	
	/*
	 * public static boolean isPerfectNumber(int number) { int sum =0; int divisor
	 * =1; while(divisor<number) {
	 * 
	 * } }
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n to find it as Perfect number");
		int n = sc.nextInt();
		
		int sum = 0;
		int divisor =1;
		
		while(divisor<n)
		{
			if (n % divisor == 0)
			{
				sum = sum + divisor;
			}
			divisor++;
		}
		//System.out.println(sum);
		if(n == sum)
		{
			System.out.println(n + " Is a perfect number");
		}
		else
		{
			System.out.println(n + " Is not a perfect number");
		}
	}
	
}
