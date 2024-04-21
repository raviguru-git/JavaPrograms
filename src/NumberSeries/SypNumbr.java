package NumberSeries;
import java.util.Scanner;

public class SypNumbr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value for Spy number");
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		int prod =1;
		while(n>0)
		{
			int rem= n%10;  // Extracting last digit here. It gives the remainder.
			sum = sum + rem;
			prod = prod * rem;
			n = n/10;  // Failing for 324 input, need to check here.
			
		}
		if (sum == prod)
		
			System.out.println(temp + "is a Spy number");
		else
			System.out.println(temp + "is not a Spy number");
		
		
	}

}
