package CodeSignal;

import java.io.InputStream;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print in reverse:");
		int n = sc.nextInt(); int count = 0;
		
		/*
		 * while(n>0) { int res = n%10; System.out.print(res);
		 * //System.out.println(res); n = n/10;
		 * 
		 * }
		 */
		
		while(n>0)
		{
			 n = n /10;
			count++;
		}
		System.out.println("Count of the entered Number is:" + count);
		
		
		
		
	}

	
	

}
