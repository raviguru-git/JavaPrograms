package NumberSeries;
import java.util.Scanner;

public class StrongNumb {
	public static void main(String[] args) {
		
		 for (int j=100; j<100000000; j++)
		 {
			 int numb = j; int sum=0 ; int temp = numb;
		while(numb>0)
		{
			int rem = numb%10 ; // Extracting last digit.
			int fact=1;
			
			for(int i=1; i<=rem;i++) // Finding the factorial of the container in rem; because last
				// digit is stored there.
			{
				fact = fact * i;
				
			}
			sum = sum + fact;
			numb = numb/10; // Remove the last digit.
		}
		
		if (temp == sum)
			System.out.println(temp + "is a Strong Number");
		 }
	}

}