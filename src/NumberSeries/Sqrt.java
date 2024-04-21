package NumberSeries;
import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the Square root");
		int num = sc.nextInt();
		int sqrt = 0;
		
		for (int i=1 ; i<=num; i++ )
		{
			if (num%i==0); // finding the factors of 9 % its factors ==0
				if (i *i ==num)
					sqrt = i;
		}
		if(sqrt==0)
			System.out.println("There is no Square root of the number");
		else
			System.out.println("Square root of the number is:" + sqrt);
	}

}
