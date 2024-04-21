package NumberSeries;
import java.util.Scanner;

public class ProdOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int prod =1; // Initialising prod value
		while (n>0)
		{
			int rem = n%10;
			prod = prod *rem;
			n = n/10;
		}
		System.out.println(prod);
		
	}

}
