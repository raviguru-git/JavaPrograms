package NumberSeries;
import java.util.Scanner;

public class SpyMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find for Spy number");
		int numb = sc.nextInt();
		int temp = numb;
		String res = isSpyNumber(numb);
		System.out.println(temp+res);
		
	}

	public static String isSpyNumber(int n)
	{
		int sum=0;
		int prod =0;
		while(n>0)
		{
			int rem=n%10;
			sum = sum + rem;
			prod = prod + rem;
			n=n/10;
		}
		if (sum == prod)
			return "is a Spy number";
		else
			return  "is a not Spy number";
	}
}
