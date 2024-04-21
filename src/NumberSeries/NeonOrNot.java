package NumberSeries;
import java.util.Scanner;

public class NeonOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n value for the number");
	int n = sc.nextInt();
	int sq = n*n;
	int sum=0;
	while(sq>0)
	{
		int rem = sq%10;
		sum = sum + rem;
		sq=sq/10;
	}
	if (sum == n)
	{
		System.out.println(n +"   Is a neon number");
	}
	else
	{
		System.out.println(n + "Is not a neon number");
	}
}
}
