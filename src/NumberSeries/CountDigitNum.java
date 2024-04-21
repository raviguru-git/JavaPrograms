package NumberSeries;
import java.util.Scanner;

public class CountDigitNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		//int n =1234;
		int count=0;
		while(n>0)
		{
			n=n/10;  // To remove the last digit from the given number.
			count++;
		}
		System.out.println(count);
	}

}
